// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

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
    private java.util.List < String > uuids;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VulNames")
    private java.util.List < String > vulNames;

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
    public java.util.List < String > getUuids() {
        return this.uuids;
    }

    /**
     * @return vulNames
     */
    public java.util.List < String > getVulNames() {
        return this.vulNames;
    }

    public static final class Builder extends Request.Builder<CheckTrialFixCountRequest, Builder> {
        private String info; 
        private String type; 
        private java.util.List < String > uuids; 
        private java.util.List < String > vulNames; 

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
         * Info.
         */
        public Builder info(String info) {
            this.putQueryParameter("Info", info);
            this.info = info;
            return this;
        }

        /**
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
         * Uuids.
         */
        public Builder uuids(java.util.List < String > uuids) {
            this.putQueryParameter("Uuids", uuids);
            this.uuids = uuids;
            return this;
        }

        /**
         * VulNames.
         */
        public Builder vulNames(java.util.List < String > vulNames) {
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
