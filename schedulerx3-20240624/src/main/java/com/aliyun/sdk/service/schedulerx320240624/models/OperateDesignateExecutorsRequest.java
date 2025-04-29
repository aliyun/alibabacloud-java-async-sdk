// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.schedulerx320240624.models;

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
 * {@link OperateDesignateExecutorsRequest} extends {@link RequestModel}
 *
 * <p>OperateDesignateExecutorsRequest</p>
 */
public class OperateDesignateExecutorsRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AddressList")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<String> addressList;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AppName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String appName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ClusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String clusterId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DesignateType")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer designateType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("JobId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long jobId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Transferable")
    private Boolean transferable;

    private OperateDesignateExecutorsRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.addressList = builder.addressList;
        this.appName = builder.appName;
        this.clusterId = builder.clusterId;
        this.designateType = builder.designateType;
        this.jobId = builder.jobId;
        this.transferable = builder.transferable;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static OperateDesignateExecutorsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return addressList
     */
    public java.util.List<String> getAddressList() {
        return this.addressList;
    }

    /**
     * @return appName
     */
    public String getAppName() {
        return this.appName;
    }

    /**
     * @return clusterId
     */
    public String getClusterId() {
        return this.clusterId;
    }

    /**
     * @return designateType
     */
    public Integer getDesignateType() {
        return this.designateType;
    }

    /**
     * @return jobId
     */
    public Long getJobId() {
        return this.jobId;
    }

    /**
     * @return transferable
     */
    public Boolean getTransferable() {
        return this.transferable;
    }

    public static final class Builder extends Request.Builder<OperateDesignateExecutorsRequest, Builder> {
        private String regionId; 
        private java.util.List<String> addressList; 
        private String appName; 
        private String clusterId; 
        private Integer designateType; 
        private Long jobId; 
        private Boolean transferable; 

        private Builder() {
            super();
        } 

        private Builder(OperateDesignateExecutorsRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.addressList = request.addressList;
            this.appName = request.appName;
            this.clusterId = request.clusterId;
            this.designateType = request.designateType;
            this.jobId = request.jobId;
            this.transferable = request.transferable;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder addressList(java.util.List<String> addressList) {
            String addressListShrink = shrink(addressList, "AddressList", "json");
            this.putBodyParameter("AddressList", addressListShrink);
            this.addressList = addressList;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>test-app</p>
         */
        public Builder appName(String appName) {
            this.putBodyParameter("AppName", appName);
            this.appName = appName;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>xxljob-b6ec1xxxx</p>
         */
        public Builder clusterId(String clusterId) {
            this.putBodyParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder designateType(Integer designateType) {
            this.putBodyParameter("DesignateType", designateType);
            this.designateType = designateType;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>74</p>
         */
        public Builder jobId(Long jobId) {
            this.putBodyParameter("JobId", jobId);
            this.jobId = jobId;
            return this;
        }

        /**
         * Transferable.
         */
        public Builder transferable(Boolean transferable) {
            this.putBodyParameter("Transferable", transferable);
            this.transferable = transferable;
            return this;
        }

        @Override
        public OperateDesignateExecutorsRequest build() {
            return new OperateDesignateExecutorsRequest(this);
        } 

    } 

}
