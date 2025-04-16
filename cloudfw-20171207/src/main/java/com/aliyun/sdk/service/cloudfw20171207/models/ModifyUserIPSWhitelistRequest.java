// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudfw20171207.models;

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
 * {@link ModifyUserIPSWhitelistRequest} extends {@link RequestModel}
 *
 * <p>ModifyUserIPSWhitelistRequest</p>
 */
public class ModifyUserIPSWhitelistRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Direction")
    private Long direction;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IpVersion")
    private String ipVersion;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ListType")
    private Long listType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ListValue")
    private String listValue;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceIp")
    private String sourceIp;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("WhiteType")
    private Long whiteType;

    private ModifyUserIPSWhitelistRequest(Builder builder) {
        super(builder);
        this.direction = builder.direction;
        this.ipVersion = builder.ipVersion;
        this.lang = builder.lang;
        this.listType = builder.listType;
        this.listValue = builder.listValue;
        this.sourceIp = builder.sourceIp;
        this.whiteType = builder.whiteType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyUserIPSWhitelistRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return direction
     */
    public Long getDirection() {
        return this.direction;
    }

    /**
     * @return ipVersion
     */
    public String getIpVersion() {
        return this.ipVersion;
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return listType
     */
    public Long getListType() {
        return this.listType;
    }

    /**
     * @return listValue
     */
    public String getListValue() {
        return this.listValue;
    }

    /**
     * @return sourceIp
     */
    public String getSourceIp() {
        return this.sourceIp;
    }

    /**
     * @return whiteType
     */
    public Long getWhiteType() {
        return this.whiteType;
    }

    public static final class Builder extends Request.Builder<ModifyUserIPSWhitelistRequest, Builder> {
        private Long direction; 
        private String ipVersion; 
        private String lang; 
        private Long listType; 
        private String listValue; 
        private String sourceIp; 
        private Long whiteType; 

        private Builder() {
            super();
        } 

        private Builder(ModifyUserIPSWhitelistRequest request) {
            super(request);
            this.direction = request.direction;
            this.ipVersion = request.ipVersion;
            this.lang = request.lang;
            this.listType = request.listType;
            this.listValue = request.listValue;
            this.sourceIp = request.sourceIp;
            this.whiteType = request.whiteType;
        } 

        /**
         * Direction.
         */
        public Builder direction(Long direction) {
            this.putQueryParameter("Direction", direction);
            this.direction = direction;
            return this;
        }

        /**
         * IpVersion.
         */
        public Builder ipVersion(String ipVersion) {
            this.putQueryParameter("IpVersion", ipVersion);
            this.ipVersion = ipVersion;
            return this;
        }

        /**
         * Lang.
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * ListType.
         */
        public Builder listType(Long listType) {
            this.putQueryParameter("ListType", listType);
            this.listType = listType;
            return this;
        }

        /**
         * ListValue.
         */
        public Builder listValue(String listValue) {
            this.putQueryParameter("ListValue", listValue);
            this.listValue = listValue;
            return this;
        }

        /**
         * SourceIp.
         */
        public Builder sourceIp(String sourceIp) {
            this.putQueryParameter("SourceIp", sourceIp);
            this.sourceIp = sourceIp;
            return this;
        }

        /**
         * WhiteType.
         */
        public Builder whiteType(Long whiteType) {
            this.putQueryParameter("WhiteType", whiteType);
            this.whiteType = whiteType;
            return this;
        }

        @Override
        public ModifyUserIPSWhitelistRequest build() {
            return new ModifyUserIPSWhitelistRequest(this);
        } 

    } 

}
