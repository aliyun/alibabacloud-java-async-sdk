// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.esa20240910.models;

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
 * {@link GetPageResponseBody} extends {@link TeaModel}
 *
 * <p>GetPageResponseBody</p>
 */
public class GetPageResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Content")
    @com.aliyun.core.annotation.Validation(required = true)
    private String content;

    @com.aliyun.core.annotation.NameInMap("ContentType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String contentType;

    @com.aliyun.core.annotation.NameInMap("Description")
    @com.aliyun.core.annotation.Validation(maxLength = 1024)
    private String description;

    @com.aliyun.core.annotation.NameInMap("Id")
    private Long id;

    @com.aliyun.core.annotation.NameInMap("Kind")
    private String kind;

    @com.aliyun.core.annotation.NameInMap("Name")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 128)
    private String name;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("UpdateTime")
    private String updateTime;

    private GetPageResponseBody(Builder builder) {
        this.content = builder.content;
        this.contentType = builder.contentType;
        this.description = builder.description;
        this.id = builder.id;
        this.kind = builder.kind;
        this.name = builder.name;
        this.requestId = builder.requestId;
        this.updateTime = builder.updateTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetPageResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return content
     */
    public String getContent() {
        return this.content;
    }

    /**
     * @return contentType
     */
    public String getContentType() {
        return this.contentType;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return id
     */
    public Long getId() {
        return this.id;
    }

    /**
     * @return kind
     */
    public String getKind() {
        return this.kind;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
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
        private String content; 
        private String contentType; 
        private String description; 
        private Long id; 
        private String kind; 
        private String name; 
        private String requestId; 
        private String updateTime; 

        private Builder() {
        } 

        private Builder(GetPageResponseBody model) {
            this.content = model.content;
            this.contentType = model.contentType;
            this.description = model.description;
            this.id = model.id;
            this.kind = model.kind;
            this.name = model.name;
            this.requestId = model.requestId;
            this.updateTime = model.updateTime;
        } 

        /**
         * <p>The Base64-encoded content of the error page. The content type is specified by the Content-Type field.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>PGh0bWw+aGVsbG8gcGFnZTwvaHRtbD4=</p>
         */
        public Builder content(String content) {
            this.content = content;
            return this;
        }

        /**
         * <p>The Content-Type field in the HTTP header.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>text/html</p>
         */
        public Builder contentType(String contentType) {
            this.contentType = contentType;
            return this;
        }

        /**
         * <p>The description of the custom error page.</p>
         * 
         * <strong>example:</strong>
         * <p>a custom deny page</p>
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * <p>The ID of the custom error page.<a href="~~2850223~~"></a></p>
         * 
         * <strong>example:</strong>
         * <p>50000001</p>
         */
        public Builder id(Long id) {
            this.id = id;
            return this;
        }

        /**
         * <p>The type of the custom response page.</p>
         * 
         * <strong>example:</strong>
         * <p>custom</p>
         */
        public Builder kind(String kind) {
            this.kind = kind;
            return this;
        }

        /**
         * <p>The name of the custom response page.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>example</p>
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>36af3fcc-43d0-441c-86b1-428951dc8225</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The time when the custom error page was last modified.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-01-01T00:00:00Z</p>
         */
        public Builder updateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }

        public GetPageResponseBody build() {
            return new GetPageResponseBody(this);
        } 

    } 

}
