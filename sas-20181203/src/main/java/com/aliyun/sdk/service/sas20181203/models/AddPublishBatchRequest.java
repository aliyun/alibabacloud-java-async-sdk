// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

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
 * {@link AddPublishBatchRequest} extends {@link RequestModel}
 *
 * <p>AddPublishBatchRequest</p>
 */
public class AddPublishBatchRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BatchName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String batchName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Interval")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer interval;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OperationBase")
    private Integer operationBase;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UpgradeVersion")
    @com.aliyun.core.annotation.Validation(required = true)
    private String upgradeVersion;

    private AddPublishBatchRequest(Builder builder) {
        super(builder);
        this.batchName = builder.batchName;
        this.interval = builder.interval;
        this.operationBase = builder.operationBase;
        this.upgradeVersion = builder.upgradeVersion;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddPublishBatchRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return batchName
     */
    public String getBatchName() {
        return this.batchName;
    }

    /**
     * @return interval
     */
    public Integer getInterval() {
        return this.interval;
    }

    /**
     * @return operationBase
     */
    public Integer getOperationBase() {
        return this.operationBase;
    }

    /**
     * @return upgradeVersion
     */
    public String getUpgradeVersion() {
        return this.upgradeVersion;
    }

    public static final class Builder extends Request.Builder<AddPublishBatchRequest, Builder> {
        private String batchName; 
        private Integer interval; 
        private Integer operationBase; 
        private String upgradeVersion; 

        private Builder() {
            super();
        } 

        private Builder(AddPublishBatchRequest request) {
            super(request);
            this.batchName = request.batchName;
            this.interval = request.interval;
            this.operationBase = request.operationBase;
            this.upgradeVersion = request.upgradeVersion;
        } 

        /**
         * <p>The name of the release batch.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder batchName(String batchName) {
            this.putQueryParameter("BatchName", batchName);
            this.batchName = batchName;
            return this;
        }

        /**
         * <p>The interval between two release batches.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>60</p>
         */
        public Builder interval(Integer interval) {
            this.putQueryParameter("Interval", interval);
            this.interval = interval;
            return this;
        }

        /**
         * <p>The dimension based on which the asset is selected. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: selects the asset by instance.</li>
         * <li><strong>1</strong>: selects the asset by machine group.</li>
         * <li><strong>2</strong>: selects the asset by the ID of the instance that is deployed in the virtual private cloud (VPC).</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder operationBase(Integer operationBase) {
            this.putQueryParameter("OperationBase", operationBase);
            this.operationBase = operationBase;
            return this;
        }

        /**
         * <p>The version to which you want to upgrade the agent.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>0.0.9</p>
         */
        public Builder upgradeVersion(String upgradeVersion) {
            this.putQueryParameter("UpgradeVersion", upgradeVersion);
            this.upgradeVersion = upgradeVersion;
            return this;
        }

        @Override
        public AddPublishBatchRequest build() {
            return new AddPublishBatchRequest(this);
        } 

    } 

}
