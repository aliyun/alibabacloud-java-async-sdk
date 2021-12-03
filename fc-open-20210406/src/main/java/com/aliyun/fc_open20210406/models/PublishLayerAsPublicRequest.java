// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc_open20210406.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link PublishLayerAsPublicRequest} extends {@link RequestModel}
 *
 * <p>PublishLayerAsPublicRequest</p>
 */
public class PublishLayerAsPublicRequest extends Request {
    @Path
    @NameInMap("layerName")
    private String layerName;

    @Path
    @NameInMap("version")
    private String version;


    private PublishLayerAsPublicRequest(Builder builder) {
        super(builder);
        this.layerName = builder.layerName;
        this.version = builder.version;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PublishLayerAsPublicRequest create() {
        return builder().build();
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
        private String layerName; 
        private String version; 

        /**
         * <p>A short description of struct</p>
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

        public PublishLayerAsPublicRequest build() {
            return new PublishLayerAsPublicRequest(this);
        } 

    } 

}
