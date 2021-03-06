// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cbn20170912.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeCenAttachedChildInstanceAttributeResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeCenAttachedChildInstanceAttributeResponseBody</p>
 */
public class DescribeCenAttachedChildInstanceAttributeResponseBody extends TeaModel {
    @NameInMap("CenId")
    private String cenId;

    @NameInMap("ChildInstanceAttachTime")
    private String childInstanceAttachTime;

    @NameInMap("ChildInstanceId")
    private String childInstanceId;

    @NameInMap("ChildInstanceName")
    private String childInstanceName;

    @NameInMap("ChildInstanceOwnerId")
    private Long childInstanceOwnerId;

    @NameInMap("ChildInstanceRegionId")
    private String childInstanceRegionId;

    @NameInMap("ChildInstanceType")
    private String childInstanceType;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Status")
    private String status;

    private DescribeCenAttachedChildInstanceAttributeResponseBody(Builder builder) {
        this.cenId = builder.cenId;
        this.childInstanceAttachTime = builder.childInstanceAttachTime;
        this.childInstanceId = builder.childInstanceId;
        this.childInstanceName = builder.childInstanceName;
        this.childInstanceOwnerId = builder.childInstanceOwnerId;
        this.childInstanceRegionId = builder.childInstanceRegionId;
        this.childInstanceType = builder.childInstanceType;
        this.requestId = builder.requestId;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeCenAttachedChildInstanceAttributeResponseBody create() {
        return builder().build();
    }

    /**
     * @return cenId
     */
    public String getCenId() {
        return this.cenId;
    }

    /**
     * @return childInstanceAttachTime
     */
    public String getChildInstanceAttachTime() {
        return this.childInstanceAttachTime;
    }

    /**
     * @return childInstanceId
     */
    public String getChildInstanceId() {
        return this.childInstanceId;
    }

    /**
     * @return childInstanceName
     */
    public String getChildInstanceName() {
        return this.childInstanceName;
    }

    /**
     * @return childInstanceOwnerId
     */
    public Long getChildInstanceOwnerId() {
        return this.childInstanceOwnerId;
    }

    /**
     * @return childInstanceRegionId
     */
    public String getChildInstanceRegionId() {
        return this.childInstanceRegionId;
    }

    /**
     * @return childInstanceType
     */
    public String getChildInstanceType() {
        return this.childInstanceType;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    public static final class Builder {
        private String cenId; 
        private String childInstanceAttachTime; 
        private String childInstanceId; 
        private String childInstanceName; 
        private Long childInstanceOwnerId; 
        private String childInstanceRegionId; 
        private String childInstanceType; 
        private String requestId; 
        private String status; 

        /**
         * CenId.
         */
        public Builder cenId(String cenId) {
            this.cenId = cenId;
            return this;
        }

        /**
         * ChildInstanceAttachTime.
         */
        public Builder childInstanceAttachTime(String childInstanceAttachTime) {
            this.childInstanceAttachTime = childInstanceAttachTime;
            return this;
        }

        /**
         * ChildInstanceId.
         */
        public Builder childInstanceId(String childInstanceId) {
            this.childInstanceId = childInstanceId;
            return this;
        }

        /**
         * ChildInstanceName.
         */
        public Builder childInstanceName(String childInstanceName) {
            this.childInstanceName = childInstanceName;
            return this;
        }

        /**
         * ChildInstanceOwnerId.
         */
        public Builder childInstanceOwnerId(Long childInstanceOwnerId) {
            this.childInstanceOwnerId = childInstanceOwnerId;
            return this;
        }

        /**
         * ChildInstanceRegionId.
         */
        public Builder childInstanceRegionId(String childInstanceRegionId) {
            this.childInstanceRegionId = childInstanceRegionId;
            return this;
        }

        /**
         * ChildInstanceType.
         */
        public Builder childInstanceType(String childInstanceType) {
            this.childInstanceType = childInstanceType;
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
         * Status.
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        public DescribeCenAttachedChildInstanceAttributeResponseBody build() {
            return new DescribeCenAttachedChildInstanceAttributeResponseBody(this);
        } 

    } 

}
