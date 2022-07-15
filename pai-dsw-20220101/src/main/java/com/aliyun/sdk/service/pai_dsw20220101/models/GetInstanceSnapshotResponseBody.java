// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pai_dsw20220101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetInstanceSnapshotResponseBody} extends {@link TeaModel}
 *
 * <p>GetInstanceSnapshotResponseBody</p>
 */
public class GetInstanceSnapshotResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("GmtCreateTime")
    private String gmtCreateTime;

    @NameInMap("GmtModifiedTime")
    private String gmtModifiedTime;

    @NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @NameInMap("ImageId")
    private String imageId;

    @NameInMap("ImageUrl")
    private String imageUrl;

    @NameInMap("InstanceId")
    private String instanceId;

    @NameInMap("Message")
    private String message;

    @NameInMap("ReasonCode")
    private String reasonCode;

    @NameInMap("ReasonMessage")
    private String reasonMessage;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("SnapshotId")
    private String snapshotId;

    @NameInMap("SnapshotName")
    private String snapshotName;

    @NameInMap("Status")
    private String status;

    @NameInMap("Success")
    private Boolean success;

    private GetInstanceSnapshotResponseBody(Builder builder) {
        this.code = builder.code;
        this.gmtCreateTime = builder.gmtCreateTime;
        this.gmtModifiedTime = builder.gmtModifiedTime;
        this.httpStatusCode = builder.httpStatusCode;
        this.imageId = builder.imageId;
        this.imageUrl = builder.imageUrl;
        this.instanceId = builder.instanceId;
        this.message = builder.message;
        this.reasonCode = builder.reasonCode;
        this.reasonMessage = builder.reasonMessage;
        this.requestId = builder.requestId;
        this.snapshotId = builder.snapshotId;
        this.snapshotName = builder.snapshotName;
        this.status = builder.status;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetInstanceSnapshotResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return gmtCreateTime
     */
    public String getGmtCreateTime() {
        return this.gmtCreateTime;
    }

    /**
     * @return gmtModifiedTime
     */
    public String getGmtModifiedTime() {
        return this.gmtModifiedTime;
    }

    /**
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    /**
     * @return imageId
     */
    public String getImageId() {
        return this.imageId;
    }

    /**
     * @return imageUrl
     */
    public String getImageUrl() {
        return this.imageUrl;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return reasonCode
     */
    public String getReasonCode() {
        return this.reasonCode;
    }

    /**
     * @return reasonMessage
     */
    public String getReasonMessage() {
        return this.reasonMessage;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return snapshotId
     */
    public String getSnapshotId() {
        return this.snapshotId;
    }

    /**
     * @return snapshotName
     */
    public String getSnapshotName() {
        return this.snapshotName;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private String gmtCreateTime; 
        private String gmtModifiedTime; 
        private Integer httpStatusCode; 
        private String imageId; 
        private String imageUrl; 
        private String instanceId; 
        private String message; 
        private String reasonCode; 
        private String reasonMessage; 
        private String requestId; 
        private String snapshotId; 
        private String snapshotName; 
        private String status; 
        private Boolean success; 

        /**
         * 状态码
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * 实例快照创建时间
         */
        public Builder gmtCreateTime(String gmtCreateTime) {
            this.gmtCreateTime = gmtCreateTime;
            return this;
        }

        /**
         * 实例快照修改时间
         */
        public Builder gmtModifiedTime(String gmtModifiedTime) {
            this.gmtModifiedTime = gmtModifiedTime;
            return this;
        }

        /**
         * http状态码
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * 实例快照的镜像Id
         */
        public Builder imageId(String imageId) {
            this.imageId = imageId;
            return this;
        }

        /**
         * 实例快照的镜像地址
         */
        public Builder imageUrl(String imageUrl) {
            this.imageUrl = imageUrl;
            return this;
        }

        /**
         * 实例Id
         */
        public Builder instanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }

        /**
         * 说明
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * 实例快照错误代码
         */
        public Builder reasonCode(String reasonCode) {
            this.reasonCode = reasonCode;
            return this;
        }

        /**
         * 实例快照错误消息
         */
        public Builder reasonMessage(String reasonMessage) {
            this.reasonMessage = reasonMessage;
            return this;
        }

        /**
         * 请求Id
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * 实例快照Id
         */
        public Builder snapshotId(String snapshotId) {
            this.snapshotId = snapshotId;
            return this;
        }

        /**
         * 实例快照名称
         */
        public Builder snapshotName(String snapshotName) {
            this.snapshotName = snapshotName;
            return this;
        }

        /**
         * 实例快照状态
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * 成功标志
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetInstanceSnapshotResponseBody build() {
            return new GetInstanceSnapshotResponseBody(this);
        } 

    } 

}
