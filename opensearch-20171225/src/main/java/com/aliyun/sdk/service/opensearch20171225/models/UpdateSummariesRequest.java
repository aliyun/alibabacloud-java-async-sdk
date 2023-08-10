// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.opensearch20171225.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateSummariesRequest} extends {@link RequestModel}
 *
 * <p>UpdateSummariesRequest</p>
 */
public class UpdateSummariesRequest extends Request {
    @Path
    @NameInMap("appGroupIdentity")
    @Validation(required = true)
    private String appGroupIdentity;

    @Path
    @NameInMap("appId")
    @Validation(required = true)
    private Integer appId;

    @Body
    @NameInMap("body")
    private java.util.List < UpdateSummariesRequestBody> body;

    @Query
    @NameInMap("dryRun")
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
    public java.util.List < UpdateSummariesRequestBody> getBody() {
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
        private java.util.List < UpdateSummariesRequestBody> body; 
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
         * "my_app_group_name"
         */
        public Builder appGroupIdentity(String appGroupIdentity) {
            this.putPathParameter("appGroupIdentity", appGroupIdentity);
            this.appGroupIdentity = appGroupIdentity;
            return this;
        }

        /**
         * 10157886
         */
        public Builder appId(Integer appId) {
            this.putPathParameter("appId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * body.
         */
        public Builder body(java.util.List < UpdateSummariesRequestBody> body) {
            this.putBodyParameter("body", body);
            this.body = body;
            return this;
        }

        /**
         * true
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

    public static class UpdateSummariesRequestBody extends TeaModel {
        @NameInMap("element")
        private String element;

        @NameInMap("ellipsis")
        private String ellipsis;

        @NameInMap("field")
        private String field;

        @NameInMap("len")
        private Integer len;

        @NameInMap("snippet")
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

            /**
             * element.
             */
            public Builder element(String element) {
                this.element = element;
                return this;
            }

            /**
             * ellipsis.
             */
            public Builder ellipsis(String ellipsis) {
                this.ellipsis = ellipsis;
                return this;
            }

            /**
             * field.
             */
            public Builder field(String field) {
                this.field = field;
                return this;
            }

            /**
             * len.
             */
            public Builder len(Integer len) {
                this.len = len;
                return this;
            }

            /**
             * snippet.
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
