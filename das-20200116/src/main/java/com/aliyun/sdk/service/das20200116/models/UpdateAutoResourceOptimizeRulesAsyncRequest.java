// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.das20200116.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
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
         * <p>The reserved parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>None</p>
         */
        public Builder consoleContext(String consoleContext) {
            this.putQueryParameter("ConsoleContext", consoleContext);
            this.consoleContext = consoleContext;
            return this;
        }

        /**
         * <p>The database instance IDs.</p>
         * <blockquote>
         * <p> Set this parameter to a JSON array that consists of multiple instance IDs. Separate instance IDs with commas (,). Example: <code>[\&quot;Instance ID1\&quot;, \&quot;Instance ID2\&quot;]</code>.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;rm-2ze8g2am97624****&quot;,&quot;rm-2ze9xrhze0709****&quot;]</p>
         */
        public Builder instanceIds(String instanceIds) {
            this.putQueryParameter("InstanceIds", instanceIds);
            this.instanceIds = instanceIds;
            return this;
        }

        /**
         * <p>The ID of the asynchronous request.</p>
         * <blockquote>
         * <p> Asynchronous calls do not immediately return the complete results. To obtain the complete results, you must use the value of <strong>ResultId</strong> returned in the response to re-initiate the call until the value of <strong>isFinish</strong> is <strong>true</strong>.**** In this case, you must call this operation at least twice.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>async__507044db6c4eadfa2dab9b084e80****</p>
         */
        public Builder resultId(String resultId) {
            this.putQueryParameter("ResultId", resultId);
            this.resultId = resultId;
            return this;
        }

        /**
         * <p>The fragmentation rate that triggers automatic fragment recycling of a single physical table. Valid values: <strong>0.10</strong> to <strong>0.99</strong>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>0.2</p>
         */
        public Builder tableFragmentationRatio(Double tableFragmentationRatio) {
            this.putQueryParameter("TableFragmentationRatio", tableFragmentationRatio);
            this.tableFragmentationRatio = tableFragmentationRatio;
            return this;
        }

        /**
         * <p>The minimum storage usage that triggers automatic fragment recycling of a single physical table. Valid values: <strong>5</strong> to <strong>100</strong>. Unit: GB.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
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
