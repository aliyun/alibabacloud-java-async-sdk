// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pds20220301.models;

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
    private java.util.List<Requests> requests;

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
    public java.util.List<Requests> getRequests() {
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
        private java.util.List<Requests> requests; 
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
         * <p>This parameter is required.</p>
         */
        public Builder domainId(String domainId) {
            this.putHostParameter("domain_id", domainId);
            this.domainId = domainId;
            return this;
        }

        /**
         * <p>The child requests.</p>
         * <p>The number of child requests. Valid value: 1 to 100.</p>
         * <p>This parameter is required.</p>
         */
        public Builder requests(java.util.List<Requests> requests) {
            this.putBodyParameter("requests", requests);
            this.requests = requests;
            return this;
        }

        /**
         * <p>The type of the resource that you want to manage. Valid values:</p>
         * <ul>
         * <li>file: a file.</li>
         * <li>drive: an individual drive or a team drive.</li>
         * <li>user: a user.</li>
         * <li>group: a group.</li>
         * <li>membership: a group member.</li>
         * <li>share_link: a share.</li>
         * <li>async_task: an asynchronous task.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>file</p>
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

    /**
     * 
     * {@link BatchRequest} extends {@link TeaModel}
     *
     * <p>BatchRequest</p>
     */
    public static class Requests extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("body")
        private java.util.Map<String, ?> body;

        @com.aliyun.core.annotation.NameInMap("headers")
        private java.util.Map<String, String> headers;

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
        public java.util.Map<String, ?> getBody() {
            return this.body;
        }

        /**
         * @return headers
         */
        public java.util.Map<String, String> getHeaders() {
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
            private java.util.Map<String, ?> body; 
            private java.util.Map<String, String> headers; 
            private String id; 
            private String method; 
            private String url; 

            private Builder() {
            } 

            private Builder(Requests model) {
                this.body = model.body;
                this.headers = model.headers;
                this.id = model.id;
                this.method = model.method;
                this.url = model.url;
            } 

            /**
             * <p>The request parameters of a child request. The parameter value must be a JSON string. For more information, see the topic of the corresponding child request.</p>
             * <p>Before you specify the request body, you must specify a header by using Content-Type. Content-Type can only be set to application/json.</p>
             */
            public Builder body(java.util.Map<String, ?> body) {
                this.body = body;
                return this;
            }

            /**
             * <p>The header of a child request, which indicates the type of the data specified in the request body.</p>
             */
            public Builder headers(java.util.Map<String, String> headers) {
                this.headers = headers;
                return this;
            }

            /**
             * <p>The ID of the child request. The ID is used to associate a child request with a response. The ID of a child request must be unique.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>93433894994ad2e1</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The method of a child request. Valid values:</p>
             * <ul>
             * <li>POST</li>
             * <li>GET</li>
             * <li>PUT</li>
             * <li>DELETE</li>
             * <li>HEAD</li>
             * </ul>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>POST</p>
             */
            public Builder method(String method) {
                this.method = method;
                return this;
            }

            /**
             * <p>The API path of a child request. Valid values:</p>
             * <ul>
             * <li>/file/get: queries the information about a file.</li>
             * <li>/file/update: modifies the information about a file.</li>
             * <li>/file/search: searches for a file.</li>
             * <li>/file/copy: copies a file or folder.</li>
             * <li>/file/move: moves a file or folder.</li>
             * <li>/file/delete: deletes a file or folder.</li>
             * <li>/file/get_download_url: queries the download URL of a file.</li>
             * <li>/file/get_share_link_download_url: queries the download URL of a file in a share.</li>
             * <li>/recyclebin/trash: moves a file or folder to the recycle bin.</li>
             * <li>/recyclebin/restore: restores a file or folder.</li>
             * <li>/file/put_usertags: adds tags to a user.</li>
             * <li>/file/delete_usertags: removes tags from a user.</li>
             * <li>/drive/get: queries the information about a drive.</li>
             * <li>/user/get: queries the information about a user.</li>
             * <li>/group/get: queries the information about a group.</li>
             * <li>/share_link/create: creates a share.</li>
             * <li>/share_link/update: modifies a share.</li>
             * <li>/share_link/cancel: cancels a share.</li>
             * <li>/share_link/list: queries shares.</li>
             * <li>/share_link/get: queries the information about a share.</li>
             * <li>/share_link/get_share_token: queries an access token of a share.</li>
             * <li>/async_task/get: queries the information about an asynchronous task.</li>
             * </ul>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>/file/get</p>
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
