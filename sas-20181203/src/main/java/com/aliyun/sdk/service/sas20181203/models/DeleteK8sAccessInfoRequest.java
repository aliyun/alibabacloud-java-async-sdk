// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteK8sAccessInfoRequest} extends {@link RequestModel}
 *
 * <p>DeleteK8sAccessInfoRequest</p>
 */
public class DeleteK8sAccessInfoRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AliyunYundunGatewayApiName")
    private String aliyunYundunGatewayApiName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AliyunYundunGatewayPopName")
    private String aliyunYundunGatewayPopName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AliyunYundunGatewayProjectName")
    private String aliyunYundunGatewayProjectName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Id")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long id;

    private DeleteK8sAccessInfoRequest(Builder builder) {
        super(builder);
        this.aliyunYundunGatewayApiName = builder.aliyunYundunGatewayApiName;
        this.aliyunYundunGatewayPopName = builder.aliyunYundunGatewayPopName;
        this.aliyunYundunGatewayProjectName = builder.aliyunYundunGatewayProjectName;
        this.id = builder.id;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteK8sAccessInfoRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return aliyunYundunGatewayApiName
     */
    public String getAliyunYundunGatewayApiName() {
        return this.aliyunYundunGatewayApiName;
    }

    /**
     * @return aliyunYundunGatewayPopName
     */
    public String getAliyunYundunGatewayPopName() {
        return this.aliyunYundunGatewayPopName;
    }

    /**
     * @return aliyunYundunGatewayProjectName
     */
    public String getAliyunYundunGatewayProjectName() {
        return this.aliyunYundunGatewayProjectName;
    }

    /**
     * @return id
     */
    public Long getId() {
        return this.id;
    }

    public static final class Builder extends Request.Builder<DeleteK8sAccessInfoRequest, Builder> {
        private String aliyunYundunGatewayApiName; 
        private String aliyunYundunGatewayPopName; 
        private String aliyunYundunGatewayProjectName; 
        private Long id; 

        private Builder() {
            super();
        } 

        private Builder(DeleteK8sAccessInfoRequest request) {
            super(request);
            this.aliyunYundunGatewayApiName = request.aliyunYundunGatewayApiName;
            this.aliyunYundunGatewayPopName = request.aliyunYundunGatewayPopName;
            this.aliyunYundunGatewayProjectName = request.aliyunYundunGatewayProjectName;
            this.id = request.id;
        } 

        /**
         * This parameter is deprecated.
         */
        public Builder aliyunYundunGatewayApiName(String aliyunYundunGatewayApiName) {
            this.putQueryParameter("AliyunYundunGatewayApiName", aliyunYundunGatewayApiName);
            this.aliyunYundunGatewayApiName = aliyunYundunGatewayApiName;
            return this;
        }

        /**
         * This parameter is deprecated.
         */
        public Builder aliyunYundunGatewayPopName(String aliyunYundunGatewayPopName) {
            this.putQueryParameter("AliyunYundunGatewayPopName", aliyunYundunGatewayPopName);
            this.aliyunYundunGatewayPopName = aliyunYundunGatewayPopName;
            return this;
        }

        /**
         * This parameter is deprecated.
         */
        public Builder aliyunYundunGatewayProjectName(String aliyunYundunGatewayProjectName) {
            this.putQueryParameter("AliyunYundunGatewayProjectName", aliyunYundunGatewayProjectName);
            this.aliyunYundunGatewayProjectName = aliyunYundunGatewayProjectName;
            return this;
        }

        /**
         * The ID generated when Kubernetes is connected. You can call the GenerateK8sAccessInfo operation to query the ID.
         */
        public Builder id(Long id) {
            this.putQueryParameter("Id", id);
            this.id = id;
            return this;
        }

        @Override
        public DeleteK8sAccessInfoRequest build() {
            return new DeleteK8sAccessInfoRequest(this);
        } 

    } 

}
