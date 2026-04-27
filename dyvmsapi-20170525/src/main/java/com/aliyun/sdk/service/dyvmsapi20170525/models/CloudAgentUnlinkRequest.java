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
 * {@link CloudAgentUnlinkRequest} extends {@link RequestModel}
 *
 * <p>CloudAgentUnlinkRequest</p>
 */
public class CloudAgentUnlinkRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Cno")
    private String cno;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EnterpriseId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long enterpriseId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RequestUniqueId")
    private String requestUniqueId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Side")
    private Long side;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UniqueId")
    private String uniqueId;

    private CloudAgentUnlinkRequest(Builder builder) {
        super(builder);
        this.cno = builder.cno;
        this.enterpriseId = builder.enterpriseId;
        this.requestUniqueId = builder.requestUniqueId;
        this.side = builder.side;
        this.uniqueId = builder.uniqueId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CloudAgentUnlinkRequest create() {
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
     * @return enterpriseId
     */
    public Long getEnterpriseId() {
        return this.enterpriseId;
    }

    /**
     * @return requestUniqueId
     */
    public String getRequestUniqueId() {
        return this.requestUniqueId;
    }

    /**
     * @return side
     */
    public Long getSide() {
        return this.side;
    }

    /**
     * @return uniqueId
     */
    public String getUniqueId() {
        return this.uniqueId;
    }

    public static final class Builder extends Request.Builder<CloudAgentUnlinkRequest, Builder> {
        private String cno; 
        private Long enterpriseId; 
        private String requestUniqueId; 
        private Long side; 
        private String uniqueId; 

        private Builder() {
            super();
        } 

        private Builder(CloudAgentUnlinkRequest request) {
            super(request);
            this.cno = request.cno;
            this.enterpriseId = request.enterpriseId;
            this.requestUniqueId = request.requestUniqueId;
            this.side = request.side;
            this.uniqueId = request.uniqueId;
        } 

        /**
         * <p>座席工号；取值3-10位正整数，参数cno,uniqueId和requestUniqueId三选一</p>
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
         * <p>请求唯一标识；参数cno,uniqueId和requestUniqueId三选一。注意：requestUniqueId挂机功能只在呼叫类型为webcall时生效，且需提前在管理后台将功能开启</p>
         * 
         * <strong>example:</strong>
         * <p>1233456789</p>
         */
        public Builder requestUniqueId(String requestUniqueId) {
            this.putQueryParameter("RequestUniqueId", requestUniqueId);
            this.requestUniqueId = requestUniqueId;
            return this;
        }

        /**
         * <p>是否座席侧挂机；取值范围：1,2（数字含义，座席侧，非座席侧)，默认座席侧</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder side(Long side) {
            this.putQueryParameter("Side", side);
            this.side = side;
            return this;
        }

        /**
         * <p>通话唯一标识；参数cno,uniqueId和requestUniqueId三选一</p>
         * 
         * <strong>example:</strong>
         * <p>1233456789</p>
         */
        public Builder uniqueId(String uniqueId) {
            this.putQueryParameter("UniqueId", uniqueId);
            this.uniqueId = uniqueId;
            return this;
        }

        @Override
        public CloudAgentUnlinkRequest build() {
            return new CloudAgentUnlinkRequest(this);
        } 

    } 

}
