// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oss20190517.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.oss.models.*;

/**
 * {@link DeletedObject} extends {@link TeaModel}
 *
 * <p>DeletedObject</p>
 */
public class DeletedObject extends TeaModel {
    @NameInMap("DeleteMarker")
    private Boolean deleteMarker;

    @NameInMap("DeleteMarkerVersionId")
    private String deleteMarkerVersionId;

    @NameInMap("Key")
    private String key;

    @NameInMap("VersionId")
    private String versionId;

    private DeletedObject(Builder builder) {
        this.deleteMarker = builder.deleteMarker;
        this.deleteMarkerVersionId = builder.deleteMarkerVersionId;
        this.key = builder.key;
        this.versionId = builder.versionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeletedObject create() {
        return builder().build();
    }

    /**
     * @return deleteMarker
     */
    public Boolean getDeleteMarker() {
        return this.deleteMarker;
    }

    /**
     * @return deleteMarkerVersionId
     */
    public String getDeleteMarkerVersionId() {
        return this.deleteMarkerVersionId;
    }

    /**
     * @return key
     */
    public String getKey() {
        return this.key;
    }

    /**
     * @return versionId
     */
    public String getVersionId() {
        return this.versionId;
    }

    public static final class Builder {
        private Boolean deleteMarker; 
        private String deleteMarkerVersionId; 
        private String key; 
        private String versionId; 

        /**
         * description
         */
        public Builder deleteMarker(Boolean deleteMarker) {
            this.deleteMarker = deleteMarker;
            return this;
        }

        /**
         * description
         */
        public Builder deleteMarkerVersionId(String deleteMarkerVersionId) {
            this.deleteMarkerVersionId = deleteMarkerVersionId;
            return this;
        }

        /**
         * description
         */
        public Builder key(String key) {
            this.key = key;
            return this;
        }

        /**
         * description
         */
        public Builder versionId(String versionId) {
            this.versionId = versionId;
            return this;
        }

        public DeletedObject build() {
            return new DeletedObject(this);
        } 

    } 

}
