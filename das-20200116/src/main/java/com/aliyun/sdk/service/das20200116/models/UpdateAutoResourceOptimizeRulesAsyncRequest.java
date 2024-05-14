// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.das20200116.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateAutoResourceOptimizeRulesAsyncRequest} extends {@link RequestModel}
 *
 * <p>UpdateAutoResourceOptimizeRulesAsyncRequest</p>
 */
public class UpdateAutoResourceOptimizeRulesAsyncRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ConsoleContext")
    private String consoleContext;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceIds")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResultId")
    private String resultId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TableFragmentationRatio")
    @com.aliyun.core.annotation.Validation(required = true)
    private Double tableFragmentationRatio;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TableSpaceSize")
    @com.aliyun.core.annotation.Validation(required = true)
    private Double tableSpaceSize;

    private UpdateAutoResourceOptimizeRulesAsyncRequest(Builder builder) {
        super(builder);
        this.consoleContext = builder.consoleContext;
        this.instanceIds = builder.instanceIds;
        this.resultId = builder.resultId;
        this.tableFragmentationRatio = builder.tableFragmentationRatio;
        this.tableSpaceSize = builder.tableSpaceSize;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateAutoResourceOptimizeRulesAsyncRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return consoleContext
     */
    public String getConsoleContext() {
        return this.consoleContext;
    }

    /**
     * @return instanceIds
     */
    public String getInstanceIds() {
        return this.instanceIds;
    }

    /**
     * @return resultId
     */
    public String getResultId() {
        return this.resultId;
    }

    /**
     * @return tableFragmentationRatio
     */
    public Double getTableFragmentationRatio() {
        return this.tableFragmentationRatio;
    }

    /**
     * @return tableSpaceSize
     */
    public Double getTableSpaceSize() {
        return this.tableSpaceSize;
    }

    public static final class Builder extends Request.Builder<UpdateAutoResourceOptimizeRulesAsyncRequest, Builder> {
        private String consoleContext; 
        private String instanceIds; 
        private String resultId; 
        private Double tableFragmentationRatio; 
        private Double tableSpaceSize; 

        private Builder() {
            super();
        } 

        private Builder(UpdateAutoResourceOptimizeRulesAsyncRequest request) {
            super(request);
            this.consoleContext = request.consoleContext;
            this.instanceIds = request.instanceIds;
            this.resultId = request.resultId;
            this.tableFragmentationRatio = request.tableFragmentationRatio;
            this.tableSpaceSize = request.tableSpaceSize;
        } 

        /**
         * The reserved parameter.
         */
        public Builder consoleContext(String consoleContext) {
            this.putQueryParameter("ConsoleContext", consoleContext);
            this.consoleContext = consoleContext;
            return this;
        }

        /**
         * The database instance IDs.
         * <p>
         * 
         * >  Set this parameter to a JSON array that consists of multiple instance IDs. Separate instance IDs with commas (,). Example: `[\"Instance ID1\", \"Instance ID2\"]`.
         */
        public Builder instanceIds(String instanceIds) {
            this.putQueryParameter("InstanceIds", instanceIds);
            this.instanceIds = instanceIds;
            return this;
        }

        /**
         * The ID of the asynchronous request.
         * <p>
         * 
         * >  You can leave this parameter empty when you call the operation to initiate the request for the first time, and use the value of this parameter contained in the response to the first request for subsequent requests.
         */
        public Builder resultId(String resultId) {
            this.putQueryParameter("ResultId", resultId);
            this.resultId = resultId;
            return this;
        }

        /**
         * The fragmentation rate that triggers automatic fragment recycling of a single physical table. Valid values: **0.10** to **0.99**.
         */
        public Builder tableFragmentationRatio(Double tableFragmentationRatio) {
            this.putQueryParameter("TableFragmentationRatio", tableFragmentationRatio);
            this.tableFragmentationRatio = tableFragmentationRatio;
            return this;
        }

        /**
         * The minimum storage usage that triggers automatic fragment recycling of a single physical table. Valid values: **5** to **100**. Unit: GB.
         */
        public Builder tableSpaceSize(Double tableSpaceSize) {
            this.putQueryParameter("TableSpaceSize", tableSpaceSize);
            this.tableSpaceSize = tableSpaceSize;
            return this;
        }

        @Override
        public UpdateAutoResourceOptimizeRulesAsyncRequest build() {
            return new UpdateAutoResourceOptimizeRulesAsyncRequest(this);
        } 

    } 

}
