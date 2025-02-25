// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.xtee20210910.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateSampleBatchRequest} extends {@link RequestModel}
 *
 * <p>UpdateSampleBatchRequest</p>
 */
public class UpdateSampleBatchRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ids")
    private String ids;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("regId")
    private String regId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("tags")
    private String tags;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("versions")
    private String versions;

    private UpdateSampleBatchRequest(Builder builder) {
        super(builder);
        this.lang = builder.lang;
        this.ids = builder.ids;
        this.regId = builder.regId;
        this.tags = builder.tags;
        this.versions = builder.versions;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateSampleBatchRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return ids
     */
    public String getIds() {
        return this.ids;
    }

    /**
     * @return regId
     */
    public String getRegId() {
        return this.regId;
    }

    /**
     * @return tags
     */
    public String getTags() {
        return this.tags;
    }

    /**
     * @return versions
     */
    public String getVersions() {
        return this.versions;
    }

    public static final class Builder extends Request.Builder<UpdateSampleBatchRequest, Builder> {
        private String lang; 
        private String ids; 
        private String regId; 
        private String tags; 
        private String versions; 

        private Builder() {
            super();
        } 

        private Builder(UpdateSampleBatchRequest request) {
            super(request);
            this.lang = request.lang;
            this.ids = request.ids;
            this.regId = request.regId;
            this.tags = request.tags;
            this.versions = request.versions;
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
         * ids.
         */
        public Builder ids(String ids) {
            this.putQueryParameter("ids", ids);
            this.ids = ids;
            return this;
        }

        /**
         * regId.
         */
        public Builder regId(String regId) {
            this.putQueryParameter("regId", regId);
            this.regId = regId;
            return this;
        }

        /**
         * tags.
         */
        public Builder tags(String tags) {
            this.putQueryParameter("tags", tags);
            this.tags = tags;
            return this;
        }

        /**
         * versions.
         */
        public Builder versions(String versions) {
            this.putQueryParameter("versions", versions);
            this.versions = versions;
            return this;
        }

        @Override
        public UpdateSampleBatchRequest build() {
            return new UpdateSampleBatchRequest(this);
        } 

    } 

}
