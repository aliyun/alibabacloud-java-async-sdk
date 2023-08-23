// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudfw20171207.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link PutDisableFwSwitchRequest} extends {@link RequestModel}
 *
 * <p>PutDisableFwSwitchRequest</p>
 */
public class PutDisableFwSwitchRequest extends Request {
    @Query
    @NameInMap("IpaddrList")
    private java.util.List < String > ipaddrList;

    @Query
    @NameInMap("Lang")
    private String lang;

    @Query
    @NameInMap("RegionList")
    private java.util.List < String > regionList;

    @Query
    @NameInMap("ResourceTypeList")
    private java.util.List < String > resourceTypeList;

    @Query
    @NameInMap("SourceIp")
    @Deprecated
    private String sourceIp;

    private PutDisableFwSwitchRequest(Builder builder) {
        super(builder);
        this.ipaddrList = builder.ipaddrList;
        this.lang = builder.lang;
        this.regionList = builder.regionList;
        this.resourceTypeList = builder.resourceTypeList;
        this.sourceIp = builder.sourceIp;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PutDisableFwSwitchRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return ipaddrList
     */
    public java.util.List < String > getIpaddrList() {
        return this.ipaddrList;
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return regionList
     */
    public java.util.List < String > getRegionList() {
        return this.regionList;
    }

    /**
     * @return resourceTypeList
     */
    public java.util.List < String > getResourceTypeList() {
        return this.resourceTypeList;
    }

    /**
     * @return sourceIp
     */
    public String getSourceIp() {
        return this.sourceIp;
    }

    public static final class Builder extends Request.Builder<PutDisableFwSwitchRequest, Builder> {
        private java.util.List < String > ipaddrList; 
        private String lang; 
        private java.util.List < String > regionList; 
        private java.util.List < String > resourceTypeList; 
        private String sourceIp; 

        private Builder() {
            super();
        } 

        private Builder(PutDisableFwSwitchRequest request) {
            super(request);
            this.ipaddrList = request.ipaddrList;
            this.lang = request.lang;
            this.regionList = request.regionList;
            this.resourceTypeList = request.resourceTypeList;
            this.sourceIp = request.sourceIp;
        } 

        /**
         * The IP addresses.
         * <p>
         * 
         * >  You must specify at least one of the IpaddrList, RegionList, and ResourceTypeList parameters.
         */
        public Builder ipaddrList(java.util.List < String > ipaddrList) {
            this.putQueryParameter("IpaddrList", ipaddrList);
            this.ipaddrList = ipaddrList;
            return this;
        }

        /**
         * The language of the content within the response. Valid values:
         * <p>
         * 
         * *   **zh**: Chinese (default)
         * *   **en**: English
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * The regions.
         * <p>
         * 
         * >  You must specify at least one of the IpaddrList, RegionList, and ResourceTypeList parameters.
         */
        public Builder regionList(java.util.List < String > regionList) {
            this.putQueryParameter("RegionList", regionList);
            this.regionList = regionList;
            return this;
        }

        /**
         * The types of the assets.
         * <p>
         * 
         * > You must specify at least one of the IpaddrList, RegionList, and ResourceTypeList parameters.
         */
        public Builder resourceTypeList(java.util.List < String > resourceTypeList) {
            this.putQueryParameter("ResourceTypeList", resourceTypeList);
            this.resourceTypeList = resourceTypeList;
            return this;
        }

        /**
         * The source IP address of the request.
         */
        public Builder sourceIp(String sourceIp) {
            this.putQueryParameter("SourceIp", sourceIp);
            this.sourceIp = sourceIp;
            return this;
        }

        @Override
        public PutDisableFwSwitchRequest build() {
            return new PutDisableFwSwitchRequest(this);
        } 

    } 

}
