// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListInstanceCatalogRequest} extends {@link RequestModel}
 *
 * <p>ListInstanceCatalogRequest</p>
 */
public class ListInstanceCatalogRequest extends Request {
    @Query
    @NameInMap("Lang")
    private String lang;

    @Query
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("RequirementIds")
    private java.util.List < Long > requirementIds;

    @Query
    @NameInMap("StandardIds")
    private java.util.List < Long > standardIds;

    @Query
    @NameInMap("Types")
    private java.util.List < String > types;

    private ListInstanceCatalogRequest(Builder builder) {
        super(builder);
        this.lang = builder.lang;
        this.regionId = builder.regionId;
        this.requirementIds = builder.requirementIds;
        this.standardIds = builder.standardIds;
        this.types = builder.types;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListInstanceCatalogRequest create() {
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
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return requirementIds
     */
    public java.util.List < Long > getRequirementIds() {
        return this.requirementIds;
    }

    /**
     * @return standardIds
     */
    public java.util.List < Long > getStandardIds() {
        return this.standardIds;
    }

    /**
     * @return types
     */
    public java.util.List < String > getTypes() {
        return this.types;
    }

    public static final class Builder extends Request.Builder<ListInstanceCatalogRequest, Builder> {
        private String lang; 
        private String regionId; 
        private java.util.List < Long > requirementIds; 
        private java.util.List < Long > standardIds; 
        private java.util.List < String > types; 

        private Builder() {
            super();
        } 

        private Builder(ListInstanceCatalogRequest request) {
            super(request);
            this.lang = request.lang;
            this.regionId = request.regionId;
            this.requirementIds = request.requirementIds;
            this.standardIds = request.standardIds;
            this.types = request.types;
        } 

        /**
         * The language of the content within the request and response. Valid values:
         * <p>
         * 
         * *   **zh**: Chinese
         * *   **en**: English
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * RequirementIds.
         */
        public Builder requirementIds(java.util.List < Long > requirementIds) {
            this.putQueryParameter("RequirementIds", requirementIds);
            this.requirementIds = requirementIds;
            return this;
        }

        /**
         * StandardIds.
         */
        public Builder standardIds(java.util.List < Long > standardIds) {
            this.putQueryParameter("StandardIds", standardIds);
            this.standardIds = standardIds;
            return this;
        }

        /**
         * Types.
         */
        public Builder types(java.util.List < String > types) {
            this.putQueryParameter("Types", types);
            this.types = types;
            return this;
        }

        @Override
        public ListInstanceCatalogRequest build() {
            return new ListInstanceCatalogRequest(this);
        } 

    } 

}
