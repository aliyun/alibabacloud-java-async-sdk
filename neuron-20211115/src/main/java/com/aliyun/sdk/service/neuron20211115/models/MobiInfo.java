// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.neuron20211115.models;

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
 * {@link MobiInfo} extends {@link TeaModel}
 *
 * <p>MobiInfo</p>
 */
public class MobiInfo extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("mobiCommitId")
    private String mobiCommitId;

    @com.aliyun.core.annotation.NameInMap("mobiId")
    private Long mobiId;

    @com.aliyun.core.annotation.NameInMap("mobiModuleId")
    private String mobiModuleId;

    @com.aliyun.core.annotation.NameInMap("storeUrl")
    private String storeUrl;

    private MobiInfo(Builder builder) {
        this.mobiCommitId = builder.mobiCommitId;
        this.mobiId = builder.mobiId;
        this.mobiModuleId = builder.mobiModuleId;
        this.storeUrl = builder.storeUrl;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static MobiInfo create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return mobiCommitId
     */
    public String getMobiCommitId() {
        return this.mobiCommitId;
    }

    /**
     * @return mobiId
     */
    public Long getMobiId() {
        return this.mobiId;
    }

    /**
     * @return mobiModuleId
     */
    public String getMobiModuleId() {
        return this.mobiModuleId;
    }

    /**
     * @return storeUrl
     */
    public String getStoreUrl() {
        return this.storeUrl;
    }

    public static final class Builder {
        private String mobiCommitId; 
        private Long mobiId; 
        private String mobiModuleId; 
        private String storeUrl; 

        private Builder() {
        } 

        private Builder(MobiInfo model) {
            this.mobiCommitId = model.mobiCommitId;
            this.mobiId = model.mobiId;
            this.mobiModuleId = model.mobiModuleId;
            this.storeUrl = model.storeUrl;
        } 

        /**
         * mobiCommitId.
         */
        public Builder mobiCommitId(String mobiCommitId) {
            this.mobiCommitId = mobiCommitId;
            return this;
        }

        /**
         * mobiId.
         */
        public Builder mobiId(Long mobiId) {
            this.mobiId = mobiId;
            return this;
        }

        /**
         * mobiModuleId.
         */
        public Builder mobiModuleId(String mobiModuleId) {
            this.mobiModuleId = mobiModuleId;
            return this;
        }

        /**
         * storeUrl.
         */
        public Builder storeUrl(String storeUrl) {
            this.storeUrl = storeUrl;
            return this;
        }

        public MobiInfo build() {
            return new MobiInfo(this);
        } 

    } 

}
