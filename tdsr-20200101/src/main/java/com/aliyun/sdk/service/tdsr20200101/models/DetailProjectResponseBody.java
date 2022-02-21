// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.tdsr20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DetailProjectResponseBody} extends {@link TeaModel}
 *
 * <p>DetailProjectResponseBody</p>
 */
public class DetailProjectResponseBody extends TeaModel {
    @NameInMap("BusinessId")
    private Long businessId;

    @NameInMap("BusinessName")
    private String businessName;

    @NameInMap("Code")
    private Long code;

    @NameInMap("GmtCreate")
    private Long gmtCreate;

    @NameInMap("GmtModified")
    private Long gmtModified;

    @NameInMap("Id")
    private String id;

    @NameInMap("Message")
    private String message;

    @NameInMap("Name")
    private String name;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    @NameInMap("Token")
    private String token;

    private DetailProjectResponseBody(Builder builder) {
        this.businessId = builder.businessId;
        this.businessName = builder.businessName;
        this.code = builder.code;
        this.gmtCreate = builder.gmtCreate;
        this.gmtModified = builder.gmtModified;
        this.id = builder.id;
        this.message = builder.message;
        this.name = builder.name;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.token = builder.token;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DetailProjectResponseBody create() {
        return builder().build();
    }

    /**
     * @return businessId
     */
    public Long getBusinessId() {
        return this.businessId;
    }

    /**
     * @return businessName
     */
    public String getBusinessName() {
        return this.businessName;
    }

    /**
     * @return code
     */
    public Long getCode() {
        return this.code;
    }

    /**
     * @return gmtCreate
     */
    public Long getGmtCreate() {
        return this.gmtCreate;
    }

    /**
     * @return gmtModified
     */
    public Long getGmtModified() {
        return this.gmtModified;
    }

    /**
     * @return id
     */
    public String getId() {
        return this.id;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
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
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    /**
     * @return token
     */
    public String getToken() {
        return this.token;
    }

    public static final class Builder {
        private Long businessId; 
        private String businessName; 
        private Long code; 
        private Long gmtCreate; 
        private Long gmtModified; 
        private String id; 
        private String message; 
        private String name; 
        private String requestId; 
        private Boolean success; 
        private String token; 

        /**
         * 业务ID
         */
        public Builder businessId(Long businessId) {
            this.businessId = businessId;
            return this;
        }

        /**
         * 业务名称
         */
        public Builder businessName(String businessName) {
            this.businessName = businessName;
            return this;
        }

        /**
         * 返回码
         */
        public Builder code(Long code) {
            this.code = code;
            return this;
        }

        /**
         * 创建时间
         */
        public Builder gmtCreate(Long gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }

        /**
         * 最后修改时间
         */
        public Builder gmtModified(Long gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }

        /**
         * 项目ID
         */
        public Builder id(String id) {
            this.id = id;
            return this;
        }

        /**
         * 错误消息
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * 项目名称
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * 请求ID，与入参requestId对应
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * 是否请求成功
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * Token
         */
        public Builder token(String token) {
            this.token = token;
            return this;
        }

        public DetailProjectResponseBody build() {
            return new DetailProjectResponseBody(this);
        } 

    } 

}
