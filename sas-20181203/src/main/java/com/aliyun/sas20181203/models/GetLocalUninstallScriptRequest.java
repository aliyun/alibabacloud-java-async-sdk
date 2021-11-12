// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link GetLocalUninstallScriptRequest} extends {@link RequestModel}
 *
 * <p>GetLocalUninstallScriptRequest</p>
 */
public class GetLocalUninstallScriptRequest extends Request {
    @Query
    @NameInMap("InternalNetwork")
    private Boolean internalNetwork;

    @Query
    @NameInMap("PlatformType")
    private String platformType;

    @Query
    @NameInMap("Uuid")
    private String uuid;


    private GetLocalUninstallScriptRequest(Builder builder) {
        super(builder);
        this.internalNetwork = builder.internalNetwork;
        this.platformType = builder.platformType;
        this.uuid = builder.uuid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetLocalUninstallScriptRequest create() {
        return builder().build();
    }

    /**
     * @return internalNetwork
     */
    public Boolean getInternalNetwork() {
        return this.internalNetwork;
    }

    /**
     * @return platformType
     */
    public String getPlatformType() {
        return this.platformType;
    }

    /**
     * @return uuid
     */
    public String getUuid() {
        return this.uuid;
    }

    public static final class Builder extends Request.Builder {
        private Boolean internalNetwork; 
        private String platformType; 
        private String uuid; 

        /**
         * <p>InternalNetwork.</p>
         */
        public Builder internalNetwork(Boolean internalNetwork) {
            this.putQueryParameter("InternalNetwork", internalNetwork);
            this.internalNetwork = internalNetwork;
            return this;
        }

        /**
         * <p>PlatformType.</p>
         */
        public Builder platformType(String platformType) {
            this.putQueryParameter("PlatformType", platformType);
            this.platformType = platformType;
            return this;
        }

        /**
         * <p>Uuid.</p>
         */
        public Builder uuid(String uuid) {
            this.putQueryParameter("Uuid", uuid);
            this.uuid = uuid;
            return this;
        }

        public GetLocalUninstallScriptRequest build() {
            return new GetLocalUninstallScriptRequest(this);
        } 

    } 

}
