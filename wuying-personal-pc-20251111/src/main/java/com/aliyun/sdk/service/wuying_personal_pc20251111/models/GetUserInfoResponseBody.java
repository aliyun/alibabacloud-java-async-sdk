// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.wuying_personal_pc20251111.models;

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
 * {@link GetUserInfoResponseBody} extends {@link TeaModel}
 *
 * <p>GetUserInfoResponseBody</p>
 */
public class GetUserInfoResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AliyunId")
    private String aliyunId;

    @com.aliyun.core.annotation.NameInMap("NickName")
    private String nickName;

    @com.aliyun.core.annotation.NameInMap("Phone")
    private String phone;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("UnionId")
    private String unionId;

    private GetUserInfoResponseBody(Builder builder) {
        this.aliyunId = builder.aliyunId;
        this.nickName = builder.nickName;
        this.phone = builder.phone;
        this.requestId = builder.requestId;
        this.unionId = builder.unionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetUserInfoResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return aliyunId
     */
    public String getAliyunId() {
        return this.aliyunId;
    }

    /**
     * @return nickName
     */
    public String getNickName() {
        return this.nickName;
    }

    /**
     * @return phone
     */
    public String getPhone() {
        return this.phone;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return unionId
     */
    public String getUnionId() {
        return this.unionId;
    }

    public static final class Builder {
        private String aliyunId; 
        private String nickName; 
        private String phone; 
        private String requestId; 
        private String unionId; 

        private Builder() {
        } 

        private Builder(GetUserInfoResponseBody model) {
            this.aliyunId = model.aliyunId;
            this.nickName = model.nickName;
            this.phone = model.phone;
            this.requestId = model.requestId;
            this.unionId = model.unionId;
        } 

        /**
         * AliyunId.
         */
        public Builder aliyunId(String aliyunId) {
            this.aliyunId = aliyunId;
            return this;
        }

        /**
         * NickName.
         */
        public Builder nickName(String nickName) {
            this.nickName = nickName;
            return this;
        }

        /**
         * Phone.
         */
        public Builder phone(String phone) {
            this.phone = phone;
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
         * UnionId.
         */
        public Builder unionId(String unionId) {
            this.unionId = unionId;
            return this;
        }

        public GetUserInfoResponseBody build() {
            return new GetUserInfoResponseBody(this);
        } 

    } 

}
