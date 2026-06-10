// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.computenest20210601.models;

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
 * {@link GetSkillHubConfigResponseBody} extends {@link TeaModel}
 *
 * <p>GetSkillHubConfigResponseBody</p>
 */
public class GetSkillHubConfigResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CreateTime")
    private String createTime;

    @com.aliyun.core.annotation.NameInMap("OssBucketName")
    private String ossBucketName;

    @com.aliyun.core.annotation.NameInMap("OssRegionId")
    private String ossRegionId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("UpdateTime")
    private String updateTime;

    private GetSkillHubConfigResponseBody(Builder builder) {
        this.createTime = builder.createTime;
        this.ossBucketName = builder.ossBucketName;
        this.ossRegionId = builder.ossRegionId;
        this.requestId = builder.requestId;
        this.updateTime = builder.updateTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetSkillHubConfigResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return createTime
     */
    public String getCreateTime() {
        return this.createTime;
    }

    /**
     * @return ossBucketName
     */
    public String getOssBucketName() {
        return this.ossBucketName;
    }

    /**
     * @return ossRegionId
     */
    public String getOssRegionId() {
        return this.ossRegionId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return updateTime
     */
    public String getUpdateTime() {
        return this.updateTime;
    }

    public static final class Builder {
        private String createTime; 
        private String ossBucketName; 
        private String ossRegionId; 
        private String requestId; 
        private String updateTime; 

        private Builder() {
        } 

        private Builder(GetSkillHubConfigResponseBody model) {
            this.createTime = model.createTime;
            this.ossBucketName = model.ossBucketName;
            this.ossRegionId = model.ossRegionId;
            this.requestId = model.requestId;
            this.updateTime = model.updateTime;
        } 

        /**
         * CreateTime.
         */
        public Builder createTime(String createTime) {
            this.createTime = createTime;
            return this;
        }

        /**
         * OssBucketName.
         */
        public Builder ossBucketName(String ossBucketName) {
            this.ossBucketName = ossBucketName;
            return this;
        }

        /**
         * OssRegionId.
         */
        public Builder ossRegionId(String ossRegionId) {
            this.ossRegionId = ossRegionId;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>2849EE73-AFFA-5AFD-9575-12FA886451DA</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * UpdateTime.
         */
        public Builder updateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }

        public GetSkillHubConfigResponseBody build() {
            return new GetSkillHubConfigResponseBody(this);
        } 

    } 

}
