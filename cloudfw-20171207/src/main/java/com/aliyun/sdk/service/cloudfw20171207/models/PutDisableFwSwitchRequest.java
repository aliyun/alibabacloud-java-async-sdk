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
 * {@link PutDisableFwSwitchRequest} extends {@link RequestModel}
 *
 * <p>PutDisableFwSwitchRequest</p>
 */
public class PutDisableFwSwitchRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IpaddrList")
    private java.util.List<String> ipaddrList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionList")
    private java.util.List<String> regionList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceTypeList")
    private java.util.List<String> resourceTypeList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceIp")
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
    public java.util.List<String> getIpaddrList() {
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
    public java.util.List<String> getRegionList() {
        return this.regionList;
    }

    /**
     * @return resourceTypeList
     */
    public java.util.List<String> getResourceTypeList() {
        return this.resourceTypeList;
    }

    /**
     * @return sourceIp
     */
    public String getSourceIp() {
        return this.sourceIp;
    }

    public static final class Builder extends Request.Builder<PutDisableFwSwitchRequest, Builder> {
        private java.util.List<String> ipaddrList; 
        private String lang; 
        private java.util.List<String> regionList; 
        private java.util.List<String> resourceTypeList; 
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
         * <p>The IP addresses.</p>
         * <blockquote>
         * <p> You must specify at least one of the IpaddrList, RegionList, and ResourceTypeList parameters.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>[&quot;192.0.XX.XX&quot;,&quot;192.0.XX.XX&quot;]</p>
         */
        public Builder ipaddrList(java.util.List<String> ipaddrList) {
            this.putQueryParameter("IpaddrList", ipaddrList);
            this.ipaddrList = ipaddrList;
            return this;
        }

        /**
         * <p>The language of the content within the response. Valid values:</p>
         * <ul>
         * <li><strong>zh</strong>: Chinese (default)</li>
         * <li><strong>en</strong>: English</li>
         * </ul>
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
         * <p>The regions.</p>
         * <blockquote>
         * <p> You must specify at least one of the IpaddrList, RegionList, and ResourceTypeList parameters.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>[&quot;cn-hangzhou&quot;,&quot;cn-shanghai&quot;]</p>
         */
        public Builder regionList(java.util.List<String> regionList) {
            this.putQueryParameter("RegionList", regionList);
            this.regionList = regionList;
            return this;
        }

        /**
         * <p>The types of the assets.</p>
         * <blockquote>
         * <p>You must specify at least one of the IpaddrList, RegionList, and ResourceTypeList parameters.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>[&quot;EcsPublicIp&quot;,&quot;NatEip&quot;]</p>
         */
        public Builder resourceTypeList(java.util.List<String> resourceTypeList) {
            this.putQueryParameter("ResourceTypeList", resourceTypeList);
            this.resourceTypeList = resourceTypeList;
            return this;
        }

        /**
         * <p>The source IP address of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>192.0.XX.XX</p>
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
