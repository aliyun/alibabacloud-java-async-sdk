// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ga20191120.models;

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
 * {@link ListCommonAreasRequest} extends {@link RequestModel}
 *
 * <p>ListCommonAreasRequest</p>
 */
public class ListCommonAreasRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IpVersion")
    private String ipVersion;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IsEpg")
    private Boolean isEpg;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IsIpSet")
    private Boolean isIpSet;

    private ListCommonAreasRequest(Builder builder) {
        super(builder);
        this.ipVersion = builder.ipVersion;
        this.isEpg = builder.isEpg;
        this.isIpSet = builder.isIpSet;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListCommonAreasRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return ipVersion
     */
    public String getIpVersion() {
        return this.ipVersion;
    }

    /**
     * @return isEpg
     */
    public Boolean getIsEpg() {
        return this.isEpg;
    }

    /**
     * @return isIpSet
     */
    public Boolean getIsIpSet() {
        return this.isIpSet;
    }

    public static final class Builder extends Request.Builder<ListCommonAreasRequest, Builder> {
        private String ipVersion; 
        private Boolean isEpg; 
        private Boolean isIpSet; 

        private Builder() {
            super();
        } 

        private Builder(ListCommonAreasRequest request) {
            super(request);
            this.ipVersion = request.ipVersion;
            this.isEpg = request.isEpg;
            this.isIpSet = request.isIpSet;
        } 

        /**
         * <p>The IP version used to connect to the GA instance. Valid values:</p>
         * <ul>
         * <li><strong>IPv4</strong> (default)</li>
         * <li><strong>IPv6</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>IPv4</p>
         */
        public Builder ipVersion(String ipVersion) {
            this.putQueryParameter("IpVersion", ipVersion);
            this.ipVersion = ipVersion;
            return this;
        }

        /**
         * <p>Specifies whether to query regions where endpoint groups of GA can be deployed. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: yes</li>
         * <li><strong>false</strong> (default): no</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder isEpg(Boolean isEpg) {
            this.putQueryParameter("IsEpg", isEpg);
            this.isEpg = isEpg;
            return this;
        }

        /**
         * <p>Specifies whether to query regions supported by GA. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong> (default)</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder isIpSet(Boolean isIpSet) {
            this.putQueryParameter("IsIpSet", isIpSet);
            this.isIpSet = isIpSet;
            return this;
        }

        @Override
        public ListCommonAreasRequest build() {
            return new ListCommonAreasRequest(this);
        } 

    } 

}
