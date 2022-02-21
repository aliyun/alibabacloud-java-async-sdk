// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cr20181201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetInstanceResponseBody} extends {@link TeaModel}
 *
 * <p>GetInstanceResponseBody</p>
 */
public class GetInstanceResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("CreateTime")
    private Long createTime;

    @NameInMap("InstanceId")
    private String instanceId;

    @NameInMap("InstanceName")
    private String instanceName;

    @NameInMap("InstanceSpecification")
    private String instanceSpecification;

    @NameInMap("InstanceStatus")
    private String instanceStatus;

    @NameInMap("IsSuccess")
    private Boolean isSuccess;

    @NameInMap("ModifiedTime")
    private Long modifiedTime;

    @NameInMap("RequestId")
    private String requestId;

    private GetInstanceResponseBody(Builder builder) {
        this.code = builder.code;
        this.createTime = builder.createTime;
        this.instanceId = builder.instanceId;
        this.instanceName = builder.instanceName;
        this.instanceSpecification = builder.instanceSpecification;
        this.instanceStatus = builder.instanceStatus;
        this.isSuccess = builder.isSuccess;
        this.modifiedTime = builder.modifiedTime;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetInstanceResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return createTime
     */
    public Long getCreateTime() {
        return this.createTime;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return instanceName
     */
    public String getInstanceName() {
        return this.instanceName;
    }

    /**
     * @return instanceSpecification
     */
    public String getInstanceSpecification() {
        return this.instanceSpecification;
    }

    /**
     * @return instanceStatus
     */
    public String getInstanceStatus() {
        return this.instanceStatus;
    }

    /**
     * @return isSuccess
     */
    public Boolean getIsSuccess() {
        return this.isSuccess;
    }

    /**
     * @return modifiedTime
     */
    public Long getModifiedTime() {
        return this.modifiedTime;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String code; 
        private Long createTime; 
        private String instanceId; 
        private String instanceName; 
        private String instanceSpecification; 
        private String instanceStatus; 
        private Boolean isSuccess; 
        private Long modifiedTime; 
        private String requestId; 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * CreateTime.
         */
        public Builder createTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }

        /**
         * InstanceName.
         */
        public Builder instanceName(String instanceName) {
            this.instanceName = instanceName;
            return this;
        }

        /**
         * InstanceSpecification.
         */
        public Builder instanceSpecification(String instanceSpecification) {
            this.instanceSpecification = instanceSpecification;
            return this;
        }

        /**
         * InstanceStatus.
         */
        public Builder instanceStatus(String instanceStatus) {
            this.instanceStatus = instanceStatus;
            return this;
        }

        /**
         * IsSuccess.
         */
        public Builder isSuccess(Boolean isSuccess) {
            this.isSuccess = isSuccess;
            return this;
        }

        /**
         * ModifiedTime.
         */
        public Builder modifiedTime(Long modifiedTime) {
            this.modifiedTime = modifiedTime;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetInstanceResponseBody build() {
            return new GetInstanceResponseBody(this);
        } 

    } 

}
