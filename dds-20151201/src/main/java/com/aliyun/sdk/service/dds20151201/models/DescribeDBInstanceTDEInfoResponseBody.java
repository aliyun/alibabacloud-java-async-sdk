// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dds20151201.models;

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
 * {@link DescribeDBInstanceTDEInfoResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDBInstanceTDEInfoResponseBody</p>
 */
public class DescribeDBInstanceTDEInfoResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("EncryptionKey")
    private String encryptionKey;

    @com.aliyun.core.annotation.NameInMap("EncryptorName")
    private String encryptorName;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("RoleARN")
    private String roleARN;

    @com.aliyun.core.annotation.NameInMap("TDEStatus")
    private String TDEStatus;

    private DescribeDBInstanceTDEInfoResponseBody(Builder builder) {
        this.encryptionKey = builder.encryptionKey;
        this.encryptorName = builder.encryptorName;
        this.requestId = builder.requestId;
        this.roleARN = builder.roleARN;
        this.TDEStatus = builder.TDEStatus;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDBInstanceTDEInfoResponseBody create() {
        return builder().build();
    }

    /**
     * @return encryptionKey
     */
    public String getEncryptionKey() {
        return this.encryptionKey;
    }

    /**
     * @return encryptorName
     */
    public String getEncryptorName() {
        return this.encryptorName;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return roleARN
     */
    public String getRoleARN() {
        return this.roleARN;
    }

    /**
     * @return TDEStatus
     */
    public String getTDEStatus() {
        return this.TDEStatus;
    }

    public static final class Builder {
        private String encryptionKey; 
        private String encryptorName; 
        private String requestId; 
        private String roleARN; 
        private String TDEStatus; 

        /**
         * <p>实例的自定义密钥。</p>
         * <p>目前仅以下地域支持BYOK（Bring Your Own Key，用户可以自行管理和拥有加密密钥）：</p>
         * <ul>
         * <li>华东1（杭州）</li>
         * <li>华东2（上海）</li>
         * <li>华北2（北京）</li>
         * <li>华南1（深圳）</li>
         * <li>中国（香港）</li>
         * <li>新加坡</li>
         * <li>马来西亚（吉隆坡）</li>
         * </ul>
         * <blockquote>
         * <p>支持BYOK，用户可以管理且拥有密钥，系统将返回用户的自定义密钥；不支持BYOK，用户不可管理密钥，系统将返回字符串<code>NoActiveBYOK</code>。</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>2axxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx</p>
         */
        public Builder encryptionKey(String encryptionKey) {
            this.encryptionKey = encryptionKey;
            return this;
        }

        /**
         * <p>加密算法。</p>
         * 
         * <strong>example:</strong>
         * <p>aes-256-cbc</p>
         */
        public Builder encryptorName(String encryptorName) {
            this.encryptorName = encryptorName;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>F4DD0E29-361B-42F2-9301-B0048CCCE5D6</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>指定待授权角色的全局资源描述符ARN（Alibaba Cloud Resource Name）信息。</p>
         * 
         * <strong>example:</strong>
         * <p>acs:ram::123456789012****:role/aliyunrdsinstanceencryptiondefaultrole</p>
         */
        public Builder roleARN(String roleARN) {
            this.roleARN = roleARN;
            return this;
        }

        /**
         * <p>The TDE status. Valid values:</p>
         * <ul>
         * <li><strong>enabled</strong></li>
         * <li><strong>disabled</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>enabled</p>
         */
        public Builder TDEStatus(String TDEStatus) {
            this.TDEStatus = TDEStatus;
            return this;
        }

        public DescribeDBInstanceTDEInfoResponseBody build() {
            return new DescribeDBInstanceTDEInfoResponseBody(this);
        } 

    } 

}
