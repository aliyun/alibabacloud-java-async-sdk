// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pvtz20180101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link UpdateCustomLineRequest} extends {@link RequestModel}
 *
 * <p>UpdateCustomLineRequest</p>
 */
public class UpdateCustomLineRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Ipv4s")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List < String > ipv4s;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LineId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String lineId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    private UpdateCustomLineRequest(Builder builder) {
        super(builder);
        this.ipv4s = builder.ipv4s;
        this.lang = builder.lang;
        this.lineId = builder.lineId;
        this.name = builder.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateCustomLineRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return ipv4s
     */
    public java.util.List < String > getIpv4s() {
        return this.ipv4s;
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return lineId
     */
    public String getLineId() {
        return this.lineId;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    public static final class Builder extends Request.Builder<UpdateCustomLineRequest, Builder> {
        private java.util.List < String > ipv4s; 
        private String lang; 
        private String lineId; 
        private String name; 

        private Builder() {
            super();
        } 

        private Builder(UpdateCustomLineRequest request) {
            super(request);
            this.ipv4s = request.ipv4s;
            this.lang = request.lang;
            this.lineId = request.lineId;
            this.name = request.name;
        } 

        /**
         * <p>The IPv4 CIDR blocks.</p>
         * <p>This parameter is required.</p>
         */
        public Builder ipv4s(java.util.List < String > ipv4s) {
            this.putQueryParameter("Ipv4s", ipv4s);
            this.ipv4s = ipv4s;
            return this;
        }

        /**
         * <p>The language.</p>
         * 
         * <strong>example:</strong>
         * <p>en</p>
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * <p>The unique ID of the custom line.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>100003</p>
         */
        public Builder lineId(String lineId) {
            this.putQueryParameter("LineId", lineId);
            this.lineId = lineId;
            return this;
        }

        /**
         * <p>The name of the custom line.</p>
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        @Override
        public UpdateCustomLineRequest build() {
            return new UpdateCustomLineRequest(this);
        } 

    } 

}
