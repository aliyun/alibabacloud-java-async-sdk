// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oss20190517.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link DeletedObject} extends {@link TeaModel}
 *
 * <p>DeletedObject</p>
 */
public class DeletedObject extends TeaModel {
    @NameInMap("Key")
    private String key;

    @NameInMap("VersionId")
    private String versionId;

    @NameInMap("DeleteMarker")
    private Boolean deleteMarker;

    @NameInMap("DeleteMarkerVersionId")
    private String deleteMarkerVersionId;


    private DeletedObject(Builder builder) {
        this.key = builder.key;
        this.versionId = builder.versionId;
        this.deleteMarker = builder.deleteMarker;
        this.deleteMarkerVersionId = builder.deleteMarkerVersionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeletedObject create() {
        return builder().build();
    }

    /**
     * @return key
     */
    public String key() {
        return this.key;
    }

    /**
     * @return versionId
     */
    public String versionId() {
        return this.versionId;
    }

    /**
     * @return deleteMarker
     */
    public Boolean deleteMarker() {
        return this.deleteMarker;
    }

    /**
     * @return deleteMarkerVersionId
     */
    public String deleteMarkerVersionId() {
        return this.deleteMarkerVersionId;
    }

    public static final class Builder {
        private String key; 
        private String versionId; 
        private Boolean deleteMarker; 
        private String deleteMarkerVersionId; 

        /**
         * <p>description</p>
         */
        public Builder key(String key) {
            this.key = key;
            return this;
        }

        /**
         * <p>description</p>
         */
        public Builder versionId(String versionId) {
            this.versionId = versionId;
            return this;
        }

        /**
         * <p>description</p>
         */
        public Builder deleteMarker(Boolean deleteMarker) {
            this.deleteMarker = deleteMarker;
            return this;
        }

        /**
         * <p>description</p>
         */
        public Builder deleteMarkerVersionId(String deleteMarkerVersionId) {
            this.deleteMarkerVersionId = deleteMarkerVersionId;
            return this;
        }

        public DeletedObject build() {
            return new DeletedObject(this);
        } 

    } 

}
