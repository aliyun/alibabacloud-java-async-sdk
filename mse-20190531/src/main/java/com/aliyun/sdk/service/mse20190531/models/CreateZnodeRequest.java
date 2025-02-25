// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mse20190531.models;

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
 * {@link CreateZnodeRequest} extends {@link RequestModel}
 *
 * <p>CreateZnodeRequest</p>
 */
public class CreateZnodeRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AcceptLanguage")
    private String acceptLanguage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClusterId")
    private String clusterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Data")
    private String data;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Path")
    private String path;

    private CreateZnodeRequest(Builder builder) {
        super(builder);
        this.acceptLanguage = builder.acceptLanguage;
        this.clusterId = builder.clusterId;
        this.data = builder.data;
        this.path = builder.path;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateZnodeRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return acceptLanguage
     */
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    /**
     * @return clusterId
     */
    public String getClusterId() {
        return this.clusterId;
    }

    /**
     * @return data
     */
    public String getData() {
        return this.data;
    }

    /**
     * @return path
     */
    public String getPath() {
        return this.path;
    }

    public static final class Builder extends Request.Builder<CreateZnodeRequest, Builder> {
        private String acceptLanguage; 
        private String clusterId; 
        private String data; 
        private String path; 

        private Builder() {
            super();
        } 

        private Builder(CreateZnodeRequest request) {
            super(request);
            this.acceptLanguage = request.acceptLanguage;
            this.clusterId = request.clusterId;
            this.data = request.data;
            this.path = request.path;
        } 

        /**
         * <p>The language of the response. Valid values:</p>
         * <ul>
         * <li>zh: Chinese</li>
         * <li>en: English</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>zh</p>
         */
        public Builder acceptLanguage(String acceptLanguage) {
            this.putQueryParameter("AcceptLanguage", acceptLanguage);
            this.acceptLanguage = acceptLanguage;
            return this;
        }

        /**
         * <p>The ID of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>mse-09k1q11****</p>
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * <p>The data of the node.</p>
         * 
         * <strong>example:</strong>
         * <p>data</p>
         */
        public Builder data(String data) {
            this.putQueryParameter("Data", data);
            this.data = data;
            return this;
        }

        /**
         * <p>The path of the node.</p>
         * 
         * <strong>example:</strong>
         * <p>/zookeeper</p>
         */
        public Builder path(String path) {
            this.putQueryParameter("Path", path);
            this.path = path;
            return this;
        }

        @Override
        public CreateZnodeRequest build() {
            return new CreateZnodeRequest(this);
        } 

    } 

}
