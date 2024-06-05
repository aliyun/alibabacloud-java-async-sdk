// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pds20220301.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link BatchRequest} extends {@link RequestModel}
 *
 * <p>BatchRequest</p>
 */
public class BatchRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("domain_id")
    private String domainId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("requests")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List < Requests> requests;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("resource")
    @com.aliyun.core.annotation.Validation(required = true)
    private String resource;

    private BatchRequest(Builder builder) {
        super(builder);
        this.domainId = builder.domainId;
        this.requests = builder.requests;
        this.resource = builder.resource;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BatchRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return domainId
     */
    public String getDomainId() {
        return this.domainId;
    }

    /**
     * @return requests
     */
    public java.util.List < Requests> getRequests() {
        return this.requests;
    }

    /**
     * @return resource
     */
    public String getResource() {
        return this.resource;
    }

    public static final class Builder extends Request.Builder<BatchRequest, Builder> {
        private String domainId; 
        private java.util.List < Requests> requests; 
        private String resource; 

        private Builder() {
            super();
        } 

        private Builder(BatchRequest request) {
            super(request);
            this.domainId = request.domainId;
            this.requests = request.requests;
            this.resource = request.resource;
        } 

        /**
         * domain_id.
         */
        public Builder domainId(String domainId) {
            this.putHostParameter("domain_id", domainId);
            this.domainId = domainId;
            return this;
        }

        /**
         * The child requests.
         * <p>
         * 
         * The number of child requests. Valid value: 1 to 100.
         */
        public Builder requests(java.util.List < Requests> requests) {
            this.putBodyParameter("requests", requests);
            this.requests = requests;
            return this;
        }

        /**
         * The type of the resource that you want to manage. Valid values:
         * <p>
         * 
         * *   file: a file.
         * *   drive: an individual drive or a team drive.
         * *   user: a user.
         * *   group: a group.
         * *   membership: a group member.
         * *   share_link: a share.
         * *   async_task: an asynchronous task.
         * 
         * <!---->
         * 
         * *   <!-- -->
         * 
         *     <!-- -->
         * 
         *     <!-- -->
         * 
         * *   <!-- -->
         * 
         *     <!-- -->
         * 
         *     <!-- -->
         * 
         * *   <!-- -->
         * 
         *     <!-- -->
         * 
         *     <!-- -->
         * 
         * *   <!-- -->
         * 
         *     <!-- -->
         * 
         *     <!-- -->
         * 
         * *   <!-- -->
         * 
         *     <!-- -->
         * 
         *     <!-- -->
         * 
         * *   <!-- -->
         * 
         *     <!-- -->
         * 
         *     <!-- -->
         * 
         * *   <!-- -->
         * 
         *     <!-- -->
         * 
         *     <!-- -->
         */
        public Builder resource(String resource) {
            this.putBodyParameter("resource", resource);
            this.resource = resource;
            return this;
        }

        @Override
        public BatchRequest build() {
            return new BatchRequest(this);
        } 

    } 

    public static class Requests extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("body")
        private java.util.Map < String, ? > body;

        @com.aliyun.core.annotation.NameInMap("headers")
        private java.util.Map < String, String > headers;

        @com.aliyun.core.annotation.NameInMap("id")
        @com.aliyun.core.annotation.Validation(required = true)
        private String id;

        @com.aliyun.core.annotation.NameInMap("method")
        @com.aliyun.core.annotation.Validation(required = true)
        private String method;

        @com.aliyun.core.annotation.NameInMap("url")
        @com.aliyun.core.annotation.Validation(required = true)
        private String url;

        private Requests(Builder builder) {
            this.body = builder.body;
            this.headers = builder.headers;
            this.id = builder.id;
            this.method = builder.method;
            this.url = builder.url;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Requests create() {
            return builder().build();
        }

        /**
         * @return body
         */
        public java.util.Map < String, ? > getBody() {
            return this.body;
        }

        /**
         * @return headers
         */
        public java.util.Map < String, String > getHeaders() {
            return this.headers;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return method
         */
        public String getMethod() {
            return this.method;
        }

        /**
         * @return url
         */
        public String getUrl() {
            return this.url;
        }

        public static final class Builder {
            private java.util.Map < String, ? > body; 
            private java.util.Map < String, String > headers; 
            private String id; 
            private String method; 
            private String url; 

            /**
             * The request parameters of a child request. The parameter value must be a JSON string. For more information, see the topic of the corresponding child request.
             * <p>
             * 
             * Before you specify the request body, you must specify a header by using Content-Type. Content-Type can only be set to application/json.
             */
            public Builder body(java.util.Map < String, ? > body) {
                this.body = body;
                return this;
            }

            /**
             * The header of a child request, which indicates the type of the data specified in the request body.
             */
            public Builder headers(java.util.Map < String, String > headers) {
                this.headers = headers;
                return this;
            }

            /**
             * The ID of the child request. The ID is used to associate a child request with a response. The ID of a child request must be unique.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * The method of a child request. Valid values:
             * <p>
             * 
             * *   POST
             * *   GET
             * *   PUT
             * *   DELETE
             * *   HEAD
             */
            public Builder method(String method) {
                this.method = method;
                return this;
            }

            /**
             * The API path of a child request. Valid values:
             * <p>
             * 
             * *   /file/get: queries the information about a file.
             * *   /file/update: modifies the information about a file.
             * *   /file/search: searches for a file.
             * *   /file/copy: copies a file or folder.
             * *   /file/move: moves a file or folder.
             * *   /file/delete: deletes a file or folder.
             * *   /file/get_download_url: queries the download URL of a file.
             * *   /file/get_share_link_download_url: queries the download URL of a file in a share.
             * *   /recyclebin/trash: moves a file or folder to the recycle bin.
             * *   /recyclebin/restore: restores a file or folder.
             * *   /file/put_usertags: adds tags to a user.
             * *   /file/delete_usertags: removes tags from a user.
             * *   /drive/get: queries the information about a drive.
             * *   /user/get: queries the information about a user.
             * *   /group/get: queries the information about a group.
             * *   /share_link/create: creates a share.
             * *   /share_link/update: modifies a share.
             * *   /share_link/cancel: cancels a share.
             * *   /share_link/list: queries shares.
             * *   /share_link/get: queries the information about a share.
             * *   /share_link/get_share_token: queries an access token of a share.
             * *   /async_task/get: queries the information about an asynchronous task.
             */
            public Builder url(String url) {
                this.url = url;
                return this;
            }

            public Requests build() {
                return new Requests(this);
            } 

        } 

    }
}
