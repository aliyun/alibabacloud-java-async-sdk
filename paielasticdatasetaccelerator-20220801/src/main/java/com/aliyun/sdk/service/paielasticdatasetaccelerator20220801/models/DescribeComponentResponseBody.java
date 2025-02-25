// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paielasticdatasetaccelerator20220801.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeComponentResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeComponentResponseBody</p>
 */
public class DescribeComponentResponseBody extends TeaModel {
    @NameInMap("GmtCreateTime")
    private String gmtCreateTime;

    @NameInMap("GmtModifiedTime")
    private String gmtModifiedTime;

    @NameInMap("Name")
    private String name;

    @NameInMap("OwnerId")
    private String ownerId;

    @NameInMap("RenderedContent")
    private String renderedContent;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Template")
    private Template template;

    @NameInMap("UserId")
    private String userId;

    @NameInMap("Uuid")
    private String uuid;

    @NameInMap("Version")
    private String version;

    private DescribeComponentResponseBody(Builder builder) {
        this.gmtCreateTime = builder.gmtCreateTime;
        this.gmtModifiedTime = builder.gmtModifiedTime;
        this.name = builder.name;
        this.ownerId = builder.ownerId;
        this.renderedContent = builder.renderedContent;
        this.requestId = builder.requestId;
        this.template = builder.template;
        this.userId = builder.userId;
        this.uuid = builder.uuid;
        this.version = builder.version;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeComponentResponseBody create() {
        return builder().build();
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
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return ownerId
     */
    public String getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return renderedContent
     */
    public String getRenderedContent() {
        return this.renderedContent;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return template
     */
    public Template getTemplate() {
        return this.template;
    }

    /**
     * @return userId
     */
    public String getUserId() {
        return this.userId;
    }

    /**
     * @return uuid
     */
    public String getUuid() {
        return this.uuid;
    }

    /**
     * @return version
     */
    public String getVersion() {
        return this.version;
    }

    public static final class Builder {
        private String gmtCreateTime; 
        private String gmtModifiedTime; 
        private String name; 
        private String ownerId; 
        private String renderedContent; 
        private String requestId; 
        private Template template; 
        private String userId; 
        private String uuid; 
        private String version; 

        /**
         * GmtCreateTime.
         */
        public Builder gmtCreateTime(String gmtCreateTime) {
            this.gmtCreateTime = gmtCreateTime;
            return this;
        }

        /**
         * GmtModifiedTime.
         */
        public Builder gmtModifiedTime(String gmtModifiedTime) {
            this.gmtModifiedTime = gmtModifiedTime;
            return this;
        }

        /**
         * Name.
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * OwnerId.
         */
        public Builder ownerId(String ownerId) {
            this.ownerId = ownerId;
            return this;
        }

        /**
         * RenderedContent.
         */
        public Builder renderedContent(String renderedContent) {
            this.renderedContent = renderedContent;
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
         * Template.
         */
        public Builder template(Template template) {
            this.template = template;
            return this;
        }

        /**
         * UserId.
         */
        public Builder userId(String userId) {
            this.userId = userId;
            return this;
        }

        /**
         * Uuid.
         */
        public Builder uuid(String uuid) {
            this.uuid = uuid;
            return this;
        }

        /**
         * Version.
         */
        public Builder version(String version) {
            this.version = version;
            return this;
        }

        public DescribeComponentResponseBody build() {
            return new DescribeComponentResponseBody(this);
        } 

    } 

    public static class Template extends TeaModel {
        @NameInMap("Type")
        private String type;

        @NameInMap("Uri")
        private String uri;

        private Template(Builder builder) {
            this.type = builder.type;
            this.uri = builder.uri;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Template create() {
            return builder().build();
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return uri
         */
        public String getUri() {
            return this.uri;
        }

        public static final class Builder {
            private String type; 
            private String uri; 

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * Uri.
             */
            public Builder uri(String uri) {
                this.uri = uri;
                return this;
            }

            public Template build() {
                return new Template(this);
            } 

        } 

    }
}
