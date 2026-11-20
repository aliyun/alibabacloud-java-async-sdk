// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

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
 * {@link DescribeDesktopIdsByVulNamesRequest} extends {@link RequestModel}
 *
 * <p>DescribeDesktopIdsByVulNamesRequest</p>
 */
public class DescribeDesktopIdsByVulNamesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Necessity")
    private String necessity;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OfficeSiteId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String officeSiteId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Type")
    @com.aliyun.core.annotation.Validation(required = true)
    private String type;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VulName")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<String> vulName;

    private DescribeDesktopIdsByVulNamesRequest(Builder builder) {
        super(builder);
        this.necessity = builder.necessity;
        this.officeSiteId = builder.officeSiteId;
        this.regionId = builder.regionId;
        this.type = builder.type;
        this.vulName = builder.vulName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDesktopIdsByVulNamesRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return necessity
     */
    public String getNecessity() {
        return this.necessity;
    }

    /**
     * @return officeSiteId
     */
    public String getOfficeSiteId() {
        return this.officeSiteId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    /**
     * @return vulName
     */
    public java.util.List<String> getVulName() {
        return this.vulName;
    }

    public static final class Builder extends Request.Builder<DescribeDesktopIdsByVulNamesRequest, Builder> {
        private String necessity; 
        private String officeSiteId; 
        private String regionId; 
        private String type; 
        private java.util.List<String> vulName; 

        private Builder() {
            super();
        } 

        private Builder(DescribeDesktopIdsByVulNamesRequest request) {
            super(request);
            this.necessity = request.necessity;
            this.officeSiteId = request.officeSiteId;
            this.regionId = request.regionId;
            this.type = request.type;
            this.vulName = request.vulName;
        } 

        /**
         * <p>The necessity level for vulnerability fixing, which indicates the urgency of the vulnerability. Valid values:</p>
         * <ul>
         * <li>asap: high</li>
         * <li>later: medium</li>
         * <li>nntf: low</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>asap</p>
         */
        public Builder necessity(String necessity) {
            this.putQueryParameter("Necessity", necessity);
            this.necessity = necessity;
            return this;
        }

        /**
         * <p>The workspace ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou+dir-363353****</p>
         */
        public Builder officeSiteId(String officeSiteId) {
            this.putQueryParameter("OfficeSiteId", officeSiteId);
            this.officeSiteId = officeSiteId;
            return this;
        }

        /**
         * <p>The region ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The vulnerability type. Valid values:</p>
         * <ul>
         * <li>cve: Linux software vulnerability</li>
         * <li>sys: Windows system vulnerability</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cve</p>
         */
        public Builder type(String type) {
            this.putQueryParameter("Type", type);
            this.type = type;
            return this;
        }

        /**
         * <p>The array of vulnerability names.</p>
         * <p>This parameter is required.</p>
         */
        public Builder vulName(java.util.List<String> vulName) {
            this.putQueryParameter("VulName", vulName);
            this.vulName = vulName;
            return this;
        }

        @Override
        public DescribeDesktopIdsByVulNamesRequest build() {
            return new DescribeDesktopIdsByVulNamesRequest(this);
        } 

    } 

}
