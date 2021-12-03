// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc_open20210406.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link PermanentDeleteLayerVersionRequest} extends {@link RequestModel}
 *
 * <p>PermanentDeleteLayerVersionRequest</p>
 */
public class PermanentDeleteLayerVersionRequest extends Request {
    @Path
    @NameInMap("userID")
    private String userID;

    @Path
    @NameInMap("layerName")
    private String layerName;

    @Path
    @NameInMap("version")
    private String version;


    private PermanentDeleteLayerVersionRequest(Builder builder) {
        super(builder);
        this.userID = builder.userID;
        this.layerName = builder.layerName;
        this.version = builder.version;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PermanentDeleteLayerVersionRequest create() {
        return builder().build();
    }

    /**
     * @return userID
     */
    public String getUserID() {
        return this.userID;
    }

    /**
     * @return layerName
     */
    public String getLayerName() {
        return this.layerName;
    }

    /**
     * @return version
     */
    public String getVersion() {
        return this.version;
    }

    public static final class Builder extends Request.Builder {
        private String userID; 
        private String layerName; 
        private String version; 

        /**
         * <p>userID.</p>
         */
        public Builder userID(String userID) {
            this.putPathParameter("userID", userID);
            this.userID = userID;
            return this;
        }

        /**
         * <p>layerName.</p>
         */
        public Builder layerName(String layerName) {
            this.putPathParameter("layerName", layerName);
            this.layerName = layerName;
            return this;
        }

        /**
         * <p>version.</p>
         */
        public Builder version(String version) {
            this.putPathParameter("version", version);
            this.version = version;
            return this;
        }

        public PermanentDeleteLayerVersionRequest build() {
            return new PermanentDeleteLayerVersionRequest(this);
        } 

    } 

}
