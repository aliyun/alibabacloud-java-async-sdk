// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bsn20150512.models;

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
 * {@link GrantBsnCodeRequest} extends {@link RequestModel}
 *
 * <p>GrantBsnCodeRequest</p>
 */
public class GrantBsnCodeRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AliUid")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long aliUid;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GrantToAliuid")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long grantToAliuid;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Notes")
    private String notes;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Sn")
    @com.aliyun.core.annotation.Validation(required = true)
    private String sn;

    private GrantBsnCodeRequest(Builder builder) {
        super(builder);
        this.aliUid = builder.aliUid;
        this.grantToAliuid = builder.grantToAliuid;
        this.notes = builder.notes;
        this.sn = builder.sn;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GrantBsnCodeRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return aliUid
     */
    public Long getAliUid() {
        return this.aliUid;
    }

    /**
     * @return grantToAliuid
     */
    public Long getGrantToAliuid() {
        return this.grantToAliuid;
    }

    /**
     * @return notes
     */
    public String getNotes() {
        return this.notes;
    }

    /**
     * @return sn
     */
    public String getSn() {
        return this.sn;
    }

    public static final class Builder extends Request.Builder<GrantBsnCodeRequest, Builder> {
        private Long aliUid; 
        private Long grantToAliuid; 
        private String notes; 
        private String sn; 

        private Builder() {
            super();
        } 

        private Builder(GrantBsnCodeRequest request) {
            super(request);
            this.aliUid = request.aliUid;
            this.grantToAliuid = request.grantToAliuid;
            this.notes = request.notes;
            this.sn = request.sn;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>456*******163</p>
         */
        public Builder aliUid(Long aliUid) {
            this.putQueryParameter("AliUid", aliUid);
            this.aliUid = aliUid;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>124*******345</p>
         */
        public Builder grantToAliuid(Long grantToAliuid) {
            this.putQueryParameter("GrantToAliuid", grantToAliuid);
            this.grantToAliuid = grantToAliuid;
            return this;
        }

        /**
         * Notes.
         */
        public Builder notes(String notes) {
            this.putQueryParameter("Notes", notes);
            this.notes = notes;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1131-*******-233</p>
         */
        public Builder sn(String sn) {
            this.putQueryParameter("Sn", sn);
            this.sn = sn;
            return this;
        }

        @Override
        public GrantBsnCodeRequest build() {
            return new GrantBsnCodeRequest(this);
        } 

    } 

}
