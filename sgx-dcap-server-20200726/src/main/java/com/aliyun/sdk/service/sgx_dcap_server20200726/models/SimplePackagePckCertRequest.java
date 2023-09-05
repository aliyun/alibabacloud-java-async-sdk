// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sgx_dcap_server20200726.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SimplePackagePckCertRequest} extends {@link RequestModel}
 *
 * <p>SimplePackagePckCertRequest</p>
 */
public class SimplePackagePckCertRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("cpusvn")
    @Validation(required = true)
    private String cpusvn;

    @Query
    @NameInMap("encrypted_ppid")
    private String encryptedPpid;

    @Query
    @NameInMap("pceid")
    @Validation(required = true)
    private String pceid;

    @Query
    @NameInMap("pcesvn")
    @Validation(required = true)
    private String pcesvn;

    @Query
    @NameInMap("qeid")
    @Validation(required = true)
    private String qeid;

    private SimplePackagePckCertRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.cpusvn = builder.cpusvn;
        this.encryptedPpid = builder.encryptedPpid;
        this.pceid = builder.pceid;
        this.pcesvn = builder.pcesvn;
        this.qeid = builder.qeid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SimplePackagePckCertRequest create() {
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
     * @return cpusvn
     */
    public String getCpusvn() {
        return this.cpusvn;
    }

    /**
     * @return encryptedPpid
     */
    public String getEncryptedPpid() {
        return this.encryptedPpid;
    }

    /**
     * @return pceid
     */
    public String getPceid() {
        return this.pceid;
    }

    /**
     * @return pcesvn
     */
    public String getPcesvn() {
        return this.pcesvn;
    }

    /**
     * @return qeid
     */
    public String getQeid() {
        return this.qeid;
    }

    public static final class Builder extends Request.Builder<SimplePackagePckCertRequest, Builder> {
        private String regionId; 
        private String cpusvn; 
        private String encryptedPpid; 
        private String pceid; 
        private String pcesvn; 
        private String qeid; 

        private Builder() {
            super();
        } 

        private Builder(SimplePackagePckCertRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.cpusvn = request.cpusvn;
            this.encryptedPpid = request.encryptedPpid;
            this.pceid = request.pceid;
            this.pcesvn = request.pcesvn;
            this.qeid = request.qeid;
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
         * cpusvn.
         */
        public Builder cpusvn(String cpusvn) {
            this.putQueryParameter("cpusvn", cpusvn);
            this.cpusvn = cpusvn;
            return this;
        }

        /**
         * encrypted_ppid.
         */
        public Builder encryptedPpid(String encryptedPpid) {
            this.putQueryParameter("encrypted_ppid", encryptedPpid);
            this.encryptedPpid = encryptedPpid;
            return this;
        }

        /**
         * pceid.
         */
        public Builder pceid(String pceid) {
            this.putQueryParameter("pceid", pceid);
            this.pceid = pceid;
            return this;
        }

        /**
         * pcesvn.
         */
        public Builder pcesvn(String pcesvn) {
            this.putQueryParameter("pcesvn", pcesvn);
            this.pcesvn = pcesvn;
            return this;
        }

        /**
         * qeid.
         */
        public Builder qeid(String qeid) {
            this.putQueryParameter("qeid", qeid);
            this.qeid = qeid;
            return this;
        }

        @Override
        public SimplePackagePckCertRequest build() {
            return new SimplePackagePckCertRequest(this);
        } 

    } 

}
