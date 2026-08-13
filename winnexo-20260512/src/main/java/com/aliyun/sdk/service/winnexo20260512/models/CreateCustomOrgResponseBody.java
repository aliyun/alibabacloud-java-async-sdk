// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.winnexo20260512.models;

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
 * {@link CreateCustomOrgResponseBody} extends {@link TeaModel}
 *
 * <p>CreateCustomOrgResponseBody</p>
 */
public class CreateCustomOrgResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("corpId")
    private String corpId;

    @com.aliyun.core.annotation.NameInMap("corpName")
    private String corpName;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("platformType")
    private String platformType;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private CreateCustomOrgResponseBody(Builder builder) {
        this.code = builder.code;
        this.corpId = builder.corpId;
        this.corpName = builder.corpName;
        this.message = builder.message;
        this.platformType = builder.platformType;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateCustomOrgResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return corpId
     */
    public String getCorpId() {
        return this.corpId;
    }

    /**
     * @return corpName
     */
    public String getCorpName() {
        return this.corpName;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return platformType
     */
    public String getPlatformType() {
        return this.platformType;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String code; 
        private String corpId; 
        private String corpName; 
        private String message; 
        private String platformType; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(CreateCustomOrgResponseBody model) {
            this.code = model.code;
            this.corpId = model.corpId;
            this.corpName = model.corpName;
            this.message = model.message;
            this.platformType = model.platformType;
            this.requestId = model.requestId;
        } 

        /**
         * <p>业务状态码：成功为 200，失败为后端错误码（ERR.* / InvalidParameter.*）</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>注册成功的组织标识</p>
         * 
         * <strong>example:</strong>
         * <p>exampleCorpId</p>
         */
        public Builder corpId(String corpId) {
            this.corpId = corpId;
            return this;
        }

        /**
         * <p>组织展示名称</p>
         * 
         * <strong>example:</strong>
         * <p>string_value</p>
         */
        public Builder corpName(String corpName) {
            this.corpName = corpName;
            return this;
        }

        /**
         * <p>错误描述，成功时为空</p>
         * 
         * <strong>example:</strong>
         * <p>successful</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>平台类型，固定为 custom</p>
         * 
         * <strong>example:</strong>
         * <p>string_value</p>
         */
        public Builder platformType(String platformType) {
            this.platformType = platformType;
            return this;
        }

        /**
         * <p>请求追踪 ID</p>
         * 
         * <strong>example:</strong>
         * <p>72D1EC35-B174-5595-891F-2F0B3BFBE56F</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateCustomOrgResponseBody build() {
            return new CreateCustomOrgResponseBody(this);
        } 

    } 

}
