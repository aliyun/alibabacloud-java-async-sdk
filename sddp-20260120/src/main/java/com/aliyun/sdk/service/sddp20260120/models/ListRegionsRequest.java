// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sddp20260120.models;

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
 * {@link ListRegionsRequest} extends {@link RequestModel}
 *
 * <p>ListRegionsRequest</p>
 */
public class ListRegionsRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Audited")
    private Boolean audited;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Identified")
    private Boolean identified;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LoadAll")
    private Boolean loadAll;

    private ListRegionsRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.audited = builder.audited;
        this.identified = builder.identified;
        this.lang = builder.lang;
        this.loadAll = builder.loadAll;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListRegionsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return audited
     */
    public Boolean getAudited() {
        return this.audited;
    }

    /**
     * @return identified
     */
    public Boolean getIdentified() {
        return this.identified;
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return loadAll
     */
    public Boolean getLoadAll() {
        return this.loadAll;
    }

    public static final class Builder extends Request.Builder<ListRegionsRequest, Builder> {
        private String regionId; 
        private Boolean audited; 
        private Boolean identified; 
        private String lang; 
        private Boolean loadAll; 

        private Builder() {
            super();
        } 

        private Builder(ListRegionsRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.audited = request.audited;
            this.identified = request.identified;
            this.lang = request.lang;
            this.loadAll = request.loadAll;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>Specifies whether to filter regions by assets with auditing enabled. Valid values: true: Enabled. false: Disabled. If you do not specify this parameter, this filter condition is not applied.</p>
         */
        public Builder audited(Boolean audited) {
            this.putQueryParameter("Audited", audited);
            this.audited = audited;
            return this;
        }

        /**
         * <p>Specifies whether to filter regions by assets with detection enabled. Valid values: true: Enabled. false: Disabled. If you do not specify this parameter, this filter condition is not applied.</p>
         */
        public Builder identified(Boolean identified) {
            this.putQueryParameter("Identified", identified);
            this.identified = identified;
            return this;
        }

        /**
         * <p>The language of the response. Valid values: zh: Chinese. en: English.</p>
         * 
         * <strong>example:</strong>
         * <p>zh</p>
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * <p>Specifies whether to retrieve all regions.</p>
         */
        public Builder loadAll(Boolean loadAll) {
            this.putQueryParameter("LoadAll", loadAll);
            this.loadAll = loadAll;
            return this;
        }

        @Override
        public ListRegionsRequest build() {
            return new ListRegionsRequest(this);
        } 

    } 

}
