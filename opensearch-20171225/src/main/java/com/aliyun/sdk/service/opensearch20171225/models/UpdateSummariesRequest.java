// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.opensearch20171225.models;

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
 * {@link UpdateSummariesRequest} extends {@link RequestModel}
 *
 * <p>UpdateSummariesRequest</p>
 */
public class UpdateSummariesRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("appGroupIdentity")
    @com.aliyun.core.annotation.Validation(required = true)
    private String appGroupIdentity;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("appId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer appId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("body")
    private java.util.List<UpdateSummariesRequestBody> body;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("dryRun")
    private Boolean dryRun;

    private UpdateSummariesRequest(Builder builder) {
        super(builder);
        this.appGroupIdentity = builder.appGroupIdentity;
        this.appId = builder.appId;
        this.body = builder.body;
        this.dryRun = builder.dryRun;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateSummariesRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appGroupIdentity
     */
    public String getAppGroupIdentity() {
        return this.appGroupIdentity;
    }

    /**
     * @return appId
     */
    public Integer getAppId() {
        return this.appId;
    }

    /**
     * @return body
     */
    public java.util.List<UpdateSummariesRequestBody> getBody() {
        return this.body;
    }

    /**
     * @return dryRun
     */
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public static final class Builder extends Request.Builder<UpdateSummariesRequest, Builder> {
        private String appGroupIdentity; 
        private Integer appId; 
        private java.util.List<UpdateSummariesRequestBody> body; 
        private Boolean dryRun; 

        private Builder() {
            super();
        } 

        private Builder(UpdateSummariesRequest request) {
            super(request);
            this.appGroupIdentity = request.appGroupIdentity;
            this.appId = request.appId;
            this.body = request.body;
            this.dryRun = request.dryRun;
        } 

        /**
         * <p>The name of the application.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>“my_app_group_name”</p>
         */
        public Builder appGroupIdentity(String appGroupIdentity) {
            this.putPathParameter("appGroupIdentity", appGroupIdentity);
            this.appGroupIdentity = appGroupIdentity;
            return this;
        }

        /**
         * <p>The version number of the application.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>10157886</p>
         */
        public Builder appId(Integer appId) {
            this.putPathParameter("appId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * <p>The request body.</p>
         */
        public Builder body(java.util.List<UpdateSummariesRequestBody> body) {
            this.putBodyParameter("body", body);
            this.body = body;
            return this;
        }

        /**
         * <p>Specifies whether the request is a dry run.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder dryRun(Boolean dryRun) {
            this.putQueryParameter("dryRun", dryRun);
            this.dryRun = dryRun;
            return this;
        }

        @Override
        public UpdateSummariesRequest build() {
            return new UpdateSummariesRequest(this);
        } 

    } 

    /**
     * 
     * {@link UpdateSummariesRequest} extends {@link TeaModel}
     *
     * <p>UpdateSummariesRequest</p>
     */
    public static class UpdateSummariesRequestBody extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("element")
        private String element;

        @com.aliyun.core.annotation.NameInMap("ellipsis")
        private String ellipsis;

        @com.aliyun.core.annotation.NameInMap("field")
        private String field;

        @com.aliyun.core.annotation.NameInMap("len")
        private Integer len;

        @com.aliyun.core.annotation.NameInMap("snippet")
        private Integer snippet;

        private UpdateSummariesRequestBody(Builder builder) {
            this.element = builder.element;
            this.ellipsis = builder.ellipsis;
            this.field = builder.field;
            this.len = builder.len;
            this.snippet = builder.snippet;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static UpdateSummariesRequestBody create() {
            return builder().build();
        }

        /**
         * @return element
         */
        public String getElement() {
            return this.element;
        }

        /**
         * @return ellipsis
         */
        public String getEllipsis() {
            return this.ellipsis;
        }

        /**
         * @return field
         */
        public String getField() {
            return this.field;
        }

        /**
         * @return len
         */
        public Integer getLen() {
            return this.len;
        }

        /**
         * @return snippet
         */
        public Integer getSnippet() {
            return this.snippet;
        }

        public static final class Builder {
            private String element; 
            private String ellipsis; 
            private String field; 
            private Integer len; 
            private Integer snippet; 

            private Builder() {
            } 

            private Builder(UpdateSummariesRequestBody model) {
                this.element = model.element;
                this.ellipsis = model.ellipsis;
                this.field = model.field;
                this.len = model.len;
                this.snippet = model.snippet;
            } 

            /**
             * <p>The HTML tag that is used to highlight terms in red.</p>
             * 
             * <strong>example:</strong>
             * <p>&quot;em&quot;</p>
             */
            public Builder element(String element) {
                this.element = element;
                return this;
            }

            /**
             * <p>The connector that is used to connect segments.</p>
             * 
             * <strong>example:</strong>
             * <p>&quot;...&quot;</p>
             */
            public Builder ellipsis(String ellipsis) {
                this.ellipsis = ellipsis;
                return this;
            }

            /**
             * <p>The field.</p>
             * 
             * <strong>example:</strong>
             * <p>&quot;title&quot;</p>
             */
            public Builder field(String field) {
                this.field = field;
                return this;
            }

            /**
             * <p>The length of a segment.</p>
             * 
             * <strong>example:</strong>
             * <p>50</p>
             */
            public Builder len(Integer len) {
                this.len = len;
                return this;
            }

            /**
             * <p>The number of segments.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder snippet(Integer snippet) {
                this.snippet = snippet;
                return this;
            }

            public UpdateSummariesRequestBody build() {
                return new UpdateSummariesRequestBody(this);
            } 

        } 

    }
}
