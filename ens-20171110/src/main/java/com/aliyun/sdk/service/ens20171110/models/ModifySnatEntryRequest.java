// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

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
 * {@link ModifySnatEntryRequest} extends {@link RequestModel}
 *
 * <p>ModifySnatEntryRequest</p>
 */
public class ModifySnatEntryRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IspAffinity")
    private Boolean ispAffinity;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SnatEntryId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String snatEntryId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SnatEntryName")
    @com.aliyun.core.annotation.Validation(maxLength = 128)
    private String snatEntryName;

    private ModifySnatEntryRequest(Builder builder) {
        super(builder);
        this.ispAffinity = builder.ispAffinity;
        this.snatEntryId = builder.snatEntryId;
        this.snatEntryName = builder.snatEntryName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifySnatEntryRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return ispAffinity
     */
    public Boolean getIspAffinity() {
        return this.ispAffinity;
    }

    /**
     * @return snatEntryId
     */
    public String getSnatEntryId() {
        return this.snatEntryId;
    }

    /**
     * @return snatEntryName
     */
    public String getSnatEntryName() {
        return this.snatEntryName;
    }

    public static final class Builder extends Request.Builder<ModifySnatEntryRequest, Builder> {
        private Boolean ispAffinity; 
        private String snatEntryId; 
        private String snatEntryName; 

        private Builder() {
            super();
        } 

        private Builder(ModifySnatEntryRequest request) {
            super(request);
            this.ispAffinity = request.ispAffinity;
            this.snatEntryId = request.snatEntryId;
            this.snatEntryName = request.snatEntryName;
        } 

        /**
         * IspAffinity.
         */
        public Builder ispAffinity(Boolean ispAffinity) {
            this.putQueryParameter("IspAffinity", ispAffinity);
            this.ispAffinity = ispAffinity;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>snat-5tfjp36fsrb36zs36faj0****</p>
         */
        public Builder snatEntryId(String snatEntryId) {
            this.putQueryParameter("SnatEntryId", snatEntryId);
            this.snatEntryId = snatEntryId;
            return this;
        }

        /**
         * SnatEntryName.
         */
        public Builder snatEntryName(String snatEntryName) {
            this.putQueryParameter("SnatEntryName", snatEntryName);
            this.snatEntryName = snatEntryName;
            return this;
        }

        @Override
        public ModifySnatEntryRequest build() {
            return new ModifySnatEntryRequest(this);
        } 

    } 

}
