// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20160714.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeAppResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeAppResponseBody</p>
 */
public class DescribeAppResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AppId")
    private Long appId;

    @com.aliyun.core.annotation.NameInMap("AppName")
    private String appName;

    @com.aliyun.core.annotation.NameInMap("CreatedTime")
    private String createdTime;

    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("Extend")
    private String extend;

    @com.aliyun.core.annotation.NameInMap("ModifiedTime")
    private String modifiedTime;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeAppResponseBody(Builder builder) {
        this.appId = builder.appId;
        this.appName = builder.appName;
        this.createdTime = builder.createdTime;
        this.description = builder.description;
        this.extend = builder.extend;
        this.modifiedTime = builder.modifiedTime;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAppResponseBody create() {
        return builder().build();
    }

    /**
     * @return appId
     */
    public Long getAppId() {
        return this.appId;
    }

    /**
     * @return appName
     */
    public String getAppName() {
        return this.appName;
    }

    /**
     * @return createdTime
     */
    public String getCreatedTime() {
        return this.createdTime;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return extend
     */
    public String getExtend() {
        return this.extend;
    }

    /**
     * @return modifiedTime
     */
    public String getModifiedTime() {
        return this.modifiedTime;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Long appId; 
        private String appName; 
        private String createdTime; 
        private String description; 
        private String extend; 
        private String modifiedTime; 
        private String requestId; 

        /**
         * <p>The ID of the app.</p>
         * 
         * <strong>example:</strong>
         * <p>110843374</p>
         */
        public Builder appId(Long appId) {
            this.appId = appId;
            return this;
        }

        /**
         * <p>The name of the app.</p>
         * 
         * <strong>example:</strong>
         * <p>CreateApptest</p>
         */
        public Builder appName(String appName) {
            this.appName = appName;
            return this;
        }

        /**
         * <p>The time when the app was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2019-01-29T09:33:01Z</p>
         */
        public Builder createdTime(String createdTime) {
            this.createdTime = createdTime;
            return this;
        }

        /**
         * <p>The description of the app.</p>
         * 
         * <strong>example:</strong>
         * <p>Estimated on October 15, 2021 at 10:20:27</p>
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * <p>扩展信息</p>
         * 
         * <strong>example:</strong>
         * <p>110243810311</p>
         */
        public Builder extend(String extend) {
            this.extend = extend;
            return this;
        }

        /**
         * <p>The time when the app was modified.</p>
         * 
         * <strong>example:</strong>
         * <p>2019-01-29T09:33:01Z</p>
         */
        public Builder modifiedTime(String modifiedTime) {
            this.modifiedTime = modifiedTime;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>DBDB3B0F-EC61-5F33-88AD-EC2446FA1DDB</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeAppResponseBody build() {
            return new DescribeAppResponseBody(this);
        } 

    } 

}
