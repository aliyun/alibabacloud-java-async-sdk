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
 * {@link CheckTrialFixCountRequest} extends {@link RequestModel}
 *
 * <p>CheckTrialFixCountRequest</p>
 */
public class CheckTrialFixCountRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Info")
    private String info;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Type")
    @com.aliyun.core.annotation.Validation(required = true)
    private String type;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Uuids")
    private java.util.List<String> uuids;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VulNames")
    private java.util.List<String> vulNames;

    private CheckTrialFixCountRequest(Builder builder) {
        super(builder);
        this.info = builder.info;
        this.type = builder.type;
        this.uuids = builder.uuids;
        this.vulNames = builder.vulNames;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CheckTrialFixCountRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return info
     */
    public String getInfo() {
        return this.info;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    /**
     * @return uuids
     */
    public java.util.List<String> getUuids() {
        return this.uuids;
    }

    /**
     * @return vulNames
     */
    public java.util.List<String> getVulNames() {
        return this.vulNames;
    }

    public static final class Builder extends Request.Builder<CheckTrialFixCountRequest, Builder> {
        private String info; 
        private String type; 
        private java.util.List<String> uuids; 
        private java.util.List<String> vulNames; 

        private Builder() {
            super();
        } 

        private Builder(CheckTrialFixCountRequest request) {
            super(request);
            this.info = request.info;
            this.type = request.type;
            this.uuids = request.uuids;
            this.vulNames = request.vulNames;
        } 

        /**
         * <p>The information about the vulnerability. The value of this parameter is in the JSON format and contains the following fields:</p>
         * <ul>
         * <li><p><strong>name</strong>: the name of the vulnerability.</p>
         * </li>
         * <li><p><strong>uuid</strong>: the UUID of the server on which the vulnerability is detected.</p>
         * </li>
         * <li><p><strong>tag</strong>: the tag that is added to the vulnerability. Valid values:</p>
         * <ul>
         * <li><strong>oval</strong>: Linux software vulnerability.</li>
         * <li><strong>system</strong>: Windows system vulnerability.</li>
         * <li><strong>cms</strong>: Web-CMS vulnerability.</li>
         * </ul>
         * </li>
         * </ul>
         * <blockquote>
         * <p> You must specify a value for Info or values for VulNames and Uuids to identify a vulnerability.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;name&quot;:&quot;oval:com.redhat.rhsa:def:20192143&quot;,&quot;uuid&quot;:&quot;80ee3226-1f96-4da0-a3ed-55c104e2****&quot;,&quot;tag&quot;:&quot;oval&quot;}]</p>
         */
        public Builder info(String info) {
            this.putQueryParameter("Info", info);
            this.info = info;
            return this;
        }

        /**
         * <p>The type of the vulnerability that you want to fix. Valid values:</p>
         * <ul>
         * <li><strong>cve</strong>: Linux software vulnerability.</li>
         * <li><strong>sys</strong>: Windows system vulnerability.</li>
         * <li><strong>cms</strong>: Web-CMS vulnerability.</li>
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
         * <p>The UUIDs of the servers.</p>
         */
        public Builder uuids(java.util.List<String> uuids) {
            this.putQueryParameter("Uuids", uuids);
            this.uuids = uuids;
            return this;
        }

        /**
         * <p>The names of the vulnerabilities.</p>
         */
        public Builder vulNames(java.util.List<String> vulNames) {
            this.putQueryParameter("VulNames", vulNames);
            this.vulNames = vulNames;
            return this;
        }

        @Override
        public CheckTrialFixCountRequest build() {
            return new CheckTrialFixCountRequest(this);
        } 

    } 

}
