// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link CreateHostShareKeyRequest} extends {@link RequestModel}
 *
 * <p>CreateHostShareKeyRequest</p>
 */
public class CreateHostShareKeyRequest extends Request {
    @Query
    @NameInMap("HostShareKeyName")
    private String hostShareKeyName;

    @Query
    @NameInMap("InstanceId")
    private String instanceId;

    @Query
    @NameInMap("PassPhrase")
    private String passPhrase;

    @Query
    @NameInMap("PrivateKey")
    private String privateKey;

    @Query
    @NameInMap("RegionId")
    private String regionId;


    private CreateHostShareKeyRequest(Builder builder) {
        super(builder);
        this.hostShareKeyName = builder.hostShareKeyName;
        this.instanceId = builder.instanceId;
        this.passPhrase = builder.passPhrase;
        this.privateKey = builder.privateKey;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateHostShareKeyRequest create() {
        return builder().build();
    }

    /**
     * @return hostShareKeyName
     */
    public String getHostShareKeyName() {
        return this.hostShareKeyName;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return passPhrase
     */
    public String getPassPhrase() {
        return this.passPhrase;
    }

    /**
     * @return privateKey
     */
    public String getPrivateKey() {
        return this.privateKey;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<Builder> {
        private String hostShareKeyName; 
        private String instanceId; 
        private String passPhrase; 
        private String privateKey; 
        private String regionId; 

        /**
         * <p>HostShareKeyName.</p>
         */
        public Builder hostShareKeyName(String hostShareKeyName) {
            this.putQueryParameter("HostShareKeyName", hostShareKeyName);
            this.hostShareKeyName = hostShareKeyName;
            return this;
        }

        /**
         * <p>InstanceId.</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>PassPhrase.</p>
         */
        public Builder passPhrase(String passPhrase) {
            this.putQueryParameter("PassPhrase", passPhrase);
            this.passPhrase = passPhrase;
            return this;
        }

        /**
         * <p>PrivateKey.</p>
         */
        public Builder privateKey(String privateKey) {
            this.putQueryParameter("PrivateKey", privateKey);
            this.privateKey = privateKey;
            return this;
        }

        /**
         * <p>RegionId.</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        public CreateHostShareKeyRequest build() {
            return new CreateHostShareKeyRequest(this);
        } 

    } 

}
