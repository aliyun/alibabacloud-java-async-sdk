// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.green20170823.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeUserStatusResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeUserStatusResponseBody</p>
 */
public class DescribeUserStatusResponseBody extends TeaModel {
    @NameInMap("AgreeChannel")
    private Integer agreeChannel;

    @NameInMap("Buyed")
    private Boolean buyed;

    @NameInMap("InDept")
    private Boolean inDept;

    @NameInMap("OpenApiBeginTime")
    private String openApiBeginTime;

    @NameInMap("OpenApiUsed")
    private Boolean openApiUsed;

    @NameInMap("OssCheckStatus")
    private String ossCheckStatus;

    @NameInMap("OssVideoSizeLimit")
    private Integer ossVideoSizeLimit;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Uid")
    private String uid;

    private DescribeUserStatusResponseBody(Builder builder) {
        this.agreeChannel = builder.agreeChannel;
        this.buyed = builder.buyed;
        this.inDept = builder.inDept;
        this.openApiBeginTime = builder.openApiBeginTime;
        this.openApiUsed = builder.openApiUsed;
        this.ossCheckStatus = builder.ossCheckStatus;
        this.ossVideoSizeLimit = builder.ossVideoSizeLimit;
        this.requestId = builder.requestId;
        this.uid = builder.uid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeUserStatusResponseBody create() {
        return builder().build();
    }

    /**
     * @return agreeChannel
     */
    public Integer getAgreeChannel() {
        return this.agreeChannel;
    }

    /**
     * @return buyed
     */
    public Boolean getBuyed() {
        return this.buyed;
    }

    /**
     * @return inDept
     */
    public Boolean getInDept() {
        return this.inDept;
    }

    /**
     * @return openApiBeginTime
     */
    public String getOpenApiBeginTime() {
        return this.openApiBeginTime;
    }

    /**
     * @return openApiUsed
     */
    public Boolean getOpenApiUsed() {
        return this.openApiUsed;
    }

    /**
     * @return ossCheckStatus
     */
    public String getOssCheckStatus() {
        return this.ossCheckStatus;
    }

    /**
     * @return ossVideoSizeLimit
     */
    public Integer getOssVideoSizeLimit() {
        return this.ossVideoSizeLimit;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return uid
     */
    public String getUid() {
        return this.uid;
    }

    public static final class Builder {
        private Integer agreeChannel; 
        private Boolean buyed; 
        private Boolean inDept; 
        private String openApiBeginTime; 
        private Boolean openApiUsed; 
        private String ossCheckStatus; 
        private Integer ossVideoSizeLimit; 
        private String requestId; 
        private String uid; 

        /**
         * AgreeChannel.
         */
        public Builder agreeChannel(Integer agreeChannel) {
            this.agreeChannel = agreeChannel;
            return this;
        }

        /**
         * Buyed.
         */
        public Builder buyed(Boolean buyed) {
            this.buyed = buyed;
            return this;
        }

        /**
         * InDept.
         */
        public Builder inDept(Boolean inDept) {
            this.inDept = inDept;
            return this;
        }

        /**
         * OpenApiBeginTime.
         */
        public Builder openApiBeginTime(String openApiBeginTime) {
            this.openApiBeginTime = openApiBeginTime;
            return this;
        }

        /**
         * OpenApiUsed.
         */
        public Builder openApiUsed(Boolean openApiUsed) {
            this.openApiUsed = openApiUsed;
            return this;
        }

        /**
         * OssCheckStatus.
         */
        public Builder ossCheckStatus(String ossCheckStatus) {
            this.ossCheckStatus = ossCheckStatus;
            return this;
        }

        /**
         * OssVideoSizeLimit.
         */
        public Builder ossVideoSizeLimit(Integer ossVideoSizeLimit) {
            this.ossVideoSizeLimit = ossVideoSizeLimit;
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
         * Uid.
         */
        public Builder uid(String uid) {
            this.uid = uid;
            return this;
        }

        public DescribeUserStatusResponseBody build() {
            return new DescribeUserStatusResponseBody(this);
        } 

    } 

}
