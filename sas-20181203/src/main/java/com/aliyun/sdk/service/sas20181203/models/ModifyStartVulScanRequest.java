// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

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
 * {@link ModifyStartVulScanRequest} extends {@link RequestModel}
 *
 * <p>ModifyStartVulScanRequest</p>
 */
public class ModifyStartVulScanRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Types")
    private String types;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Uuids")
    private String uuids;

    private ModifyStartVulScanRequest(Builder builder) {
        super(builder);
        this.types = builder.types;
        this.uuids = builder.uuids;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyStartVulScanRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return types
     */
    public String getTypes() {
        return this.types;
    }

    /**
     * @return uuids
     */
    public String getUuids() {
        return this.uuids;
    }

    public static final class Builder extends Request.Builder<ModifyStartVulScanRequest, Builder> {
        private String types; 
        private String uuids; 

        private Builder() {
            super();
        } 

        private Builder(ModifyStartVulScanRequest request) {
            super(request);
            this.types = request.types;
            this.uuids = request.uuids;
        } 

        /**
         * <p>The types of vulnerabilities that can be detected. Valid values:</p>
         * <ul>
         * <li><strong>cve</strong>: Linux software vulnerabilities</li>
         * <li><strong>sys</strong>: Windows system vulnerabilities</li>
         * <li><strong>cms</strong>: Web-CMS vulnerabilities</li>
         * <li><strong>app</strong>: application vulnerabilities</li>
         * <li><strong>emg</strong>: urgent vulnerabilities</li>
         * <li><strong>image</strong>: container image vulnerabilities</li>
         * <li><strong>sca</strong>: vulnerabilities that are detected based on software component analysis</li>
         * </ul>
         * <blockquote>
         * <p>If you leave this parameter empty, all types of vulnerabilities can be detected.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>&quot;cve,sys,cms,app,emg&quot;</p>
         */
        public Builder types(String types) {
            this.putQueryParameter("Types", types);
            this.types = types;
            return this;
        }

        /**
         * <p>The UUIDs of servers.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;i-sdada-xxxxx&quot;,&quot;i-ifaedada-sfsasdxxx&quot;}</p>
         */
        public Builder uuids(String uuids) {
            this.putQueryParameter("Uuids", uuids);
            this.uuids = uuids;
            return this;
        }

        @Override
        public ModifyStartVulScanRequest build() {
            return new ModifyStartVulScanRequest(this);
        } 

    } 

}
