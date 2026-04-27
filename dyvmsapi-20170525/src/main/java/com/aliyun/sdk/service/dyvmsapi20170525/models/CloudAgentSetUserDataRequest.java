// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dyvmsapi20170525.models;

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
 * {@link CloudAgentSetUserDataRequest} extends {@link RequestModel}
 *
 * <p>CloudAgentSetUserDataRequest</p>
 */
public class CloudAgentSetUserDataRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Cno")
    @com.aliyun.core.annotation.Validation(required = true)
    private String cno;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Direction")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long direction;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EnterpriseId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long enterpriseId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserData")
    @com.aliyun.core.annotation.Validation(required = true)
    private String userData;

    private CloudAgentSetUserDataRequest(Builder builder) {
        super(builder);
        this.cno = builder.cno;
        this.direction = builder.direction;
        this.enterpriseId = builder.enterpriseId;
        this.userData = builder.userData;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CloudAgentSetUserDataRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return cno
     */
    public String getCno() {
        return this.cno;
    }

    /**
     * @return direction
     */
    public Long getDirection() {
        return this.direction;
    }

    /**
     * @return enterpriseId
     */
    public Long getEnterpriseId() {
        return this.enterpriseId;
    }

    /**
     * @return userData
     */
    public String getUserData() {
        return this.userData;
    }

    public static final class Builder extends Request.Builder<CloudAgentSetUserDataRequest, Builder> {
        private String cno; 
        private Long direction; 
        private Long enterpriseId; 
        private String userData; 

        private Builder() {
            super();
        } 

        private Builder(CloudAgentSetUserDataRequest request) {
            super(request);
            this.cno = request.cno;
            this.direction = request.direction;
            this.enterpriseId = request.enterpriseId;
            this.userData = request.userData;
        } 

        /**
         * <p>座席工号；取值3-10位正整数</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1111</p>
         */
        public Builder cno(String cno) {
            this.putQueryParameter("Cno", cno);
            this.cno = cno;
            return this;
        }

        /**
         * <p>随路数据方向；取值说明：1： 座席侧，2： 非座席侧</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder direction(Long direction) {
            this.putQueryParameter("Direction", direction);
            this.direction = direction;
            return this;
        }

        /**
         * <p>呼叫中心 id</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>7000002</p>
         */
        public Builder enterpriseId(Long enterpriseId) {
            this.putQueryParameter("EnterpriseId", enterpriseId);
            this.enterpriseId = enterpriseId;
            return this;
        }

        /**
         * <p>json格式字符串,传入的值会打入通道变量,格式：json字符串{&quot;key&quot;:&quot;value&quot;} 随路数据数据格式：key=value,不支持数组，嵌套。</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;key&quot;:&quot;value&quot;}</p>
         */
        public Builder userData(String userData) {
            this.putQueryParameter("UserData", userData);
            this.userData = userData;
            return this;
        }

        @Override
        public CloudAgentSetUserDataRequest build() {
            return new CloudAgentSetUserDataRequest(this);
        } 

    } 

}
