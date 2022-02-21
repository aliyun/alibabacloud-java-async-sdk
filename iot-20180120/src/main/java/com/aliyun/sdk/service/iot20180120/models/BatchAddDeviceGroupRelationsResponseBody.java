// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link BatchAddDeviceGroupRelationsResponseBody} extends {@link TeaModel}
 *
 * <p>BatchAddDeviceGroupRelationsResponseBody</p>
 */
public class BatchAddDeviceGroupRelationsResponseBody extends TeaModel {
    @NameInMap("AlreadyRelatedGroupDeviceCount")
    private Integer alreadyRelatedGroupDeviceCount;

    @NameInMap("Code")
    private String code;

    @NameInMap("ErrorMessage")
    private String errorMessage;

    @NameInMap("ExceedTenGroupDeviceCount")
    private Integer exceedTenGroupDeviceCount;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    @NameInMap("SuccessAddedDeviceCount")
    private Integer successAddedDeviceCount;

    @NameInMap("ValidDeviceCount")
    private Integer validDeviceCount;

    private BatchAddDeviceGroupRelationsResponseBody(Builder builder) {
        this.alreadyRelatedGroupDeviceCount = builder.alreadyRelatedGroupDeviceCount;
        this.code = builder.code;
        this.errorMessage = builder.errorMessage;
        this.exceedTenGroupDeviceCount = builder.exceedTenGroupDeviceCount;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.successAddedDeviceCount = builder.successAddedDeviceCount;
        this.validDeviceCount = builder.validDeviceCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BatchAddDeviceGroupRelationsResponseBody create() {
        return builder().build();
    }

    /**
     * @return alreadyRelatedGroupDeviceCount
     */
    public Integer getAlreadyRelatedGroupDeviceCount() {
        return this.alreadyRelatedGroupDeviceCount;
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return errorMessage
     */
    public String getErrorMessage() {
        return this.errorMessage;
    }

    /**
     * @return exceedTenGroupDeviceCount
     */
    public Integer getExceedTenGroupDeviceCount() {
        return this.exceedTenGroupDeviceCount;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    /**
     * @return successAddedDeviceCount
     */
    public Integer getSuccessAddedDeviceCount() {
        return this.successAddedDeviceCount;
    }

    /**
     * @return validDeviceCount
     */
    public Integer getValidDeviceCount() {
        return this.validDeviceCount;
    }

    public static final class Builder {
        private Integer alreadyRelatedGroupDeviceCount; 
        private String code; 
        private String errorMessage; 
        private Integer exceedTenGroupDeviceCount; 
        private String requestId; 
        private Boolean success; 
        private Integer successAddedDeviceCount; 
        private Integer validDeviceCount; 

        /**
         * AlreadyRelatedGroupDeviceCount.
         */
        public Builder alreadyRelatedGroupDeviceCount(Integer alreadyRelatedGroupDeviceCount) {
            this.alreadyRelatedGroupDeviceCount = alreadyRelatedGroupDeviceCount;
            return this;
        }

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * ErrorMessage.
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * ExceedTenGroupDeviceCount.
         */
        public Builder exceedTenGroupDeviceCount(Integer exceedTenGroupDeviceCount) {
            this.exceedTenGroupDeviceCount = exceedTenGroupDeviceCount;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * SuccessAddedDeviceCount.
         */
        public Builder successAddedDeviceCount(Integer successAddedDeviceCount) {
            this.successAddedDeviceCount = successAddedDeviceCount;
            return this;
        }

        /**
         * ValidDeviceCount.
         */
        public Builder validDeviceCount(Integer validDeviceCount) {
            this.validDeviceCount = validDeviceCount;
            return this;
        }

        public BatchAddDeviceGroupRelationsResponseBody build() {
            return new BatchAddDeviceGroupRelationsResponseBody(this);
        } 

    } 

}
