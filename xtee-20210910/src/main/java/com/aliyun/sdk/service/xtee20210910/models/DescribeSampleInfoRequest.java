// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.xtee20210910.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeSampleInfoRequest} extends {@link RequestModel}
 *
 * <p>DescribeSampleInfoRequest</p>
 */
public class DescribeSampleInfoRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("id")
    private Long id;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("regId")
    private String regId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("versions")
    private Integer versions;

    private DescribeSampleInfoRequest(Builder builder) {
        super(builder);
        this.lang = builder.lang;
        this.id = builder.id;
        this.regId = builder.regId;
        this.versions = builder.versions;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSampleInfoRequest create() {
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
     * @return id
     */
    public Long getId() {
        return this.id;
    }

    /**
     * @return regId
     */
    public String getRegId() {
        return this.regId;
    }

    /**
     * @return versions
     */
    public Integer getVersions() {
        return this.versions;
    }

    public static final class Builder extends Request.Builder<DescribeSampleInfoRequest, Builder> {
        private String lang; 
        private Long id; 
        private String regId; 
        private Integer versions; 

        private Builder() {
            super();
        } 

        private Builder(DescribeSampleInfoRequest request) {
            super(request);
            this.lang = request.lang;
            this.id = request.id;
            this.regId = request.regId;
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
         * id.
         */
        public Builder id(Long id) {
            this.putQueryParameter("id", id);
            this.id = id;
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
         * versions.
         */
        public Builder versions(Integer versions) {
            this.putQueryParameter("versions", versions);
            this.versions = versions;
            return this;
        }

        @Override
        public DescribeSampleInfoRequest build() {
            return new DescribeSampleInfoRequest(this);
        } 

    } 

}
