// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pai_dlc20201203.models;

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
 * {@link SetJobTemplateDefaultVersionResponseBody} extends {@link TeaModel}
 *
 * <p>SetJobTemplateDefaultVersionResponseBody</p>
 */
public class SetJobTemplateDefaultVersionResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DefaultVersion")
    private Integer defaultVersion;

    @com.aliyun.core.annotation.NameInMap("GmtModifyTime")
    private String gmtModifyTime;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private SetJobTemplateDefaultVersionResponseBody(Builder builder) {
        this.defaultVersion = builder.defaultVersion;
        this.gmtModifyTime = builder.gmtModifyTime;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SetJobTemplateDefaultVersionResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return defaultVersion
     */
    public Integer getDefaultVersion() {
        return this.defaultVersion;
    }

    /**
     * @return gmtModifyTime
     */
    public String getGmtModifyTime() {
        return this.gmtModifyTime;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Integer defaultVersion; 
        private String gmtModifyTime; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(SetJobTemplateDefaultVersionResponseBody model) {
            this.defaultVersion = model.defaultVersion;
            this.gmtModifyTime = model.gmtModifyTime;
            this.requestId = model.requestId;
        } 

        /**
         * <p>设置后的默认版本号</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder defaultVersion(Integer defaultVersion) {
            this.defaultVersion = defaultVersion;
            return this;
        }

        /**
         * <p>Use the UTC time format: yyyy-MM-ddTHH:mmZ</p>
         * 
         * <strong>example:</strong>
         * <p>2021-01-12T14:36:00Z</p>
         */
        public Builder gmtModifyTime(String gmtModifyTime) {
            this.gmtModifyTime = gmtModifyTime;
            return this;
        }

        /**
         * <p>本次请求的 ID，用于诊断和答疑。</p>
         * 
         * <strong>example:</strong>
         * <p>473469C7-AA6F-4DC5-B3DB-xxxxxxx</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public SetJobTemplateDefaultVersionResponseBody build() {
            return new SetJobTemplateDefaultVersionResponseBody(this);
        } 

    } 

}
