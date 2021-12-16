// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oss20190517.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link Bucket} extends {@link TeaModel}
 *
 * <p>Bucket</p>
 */
public class Bucket extends TeaModel {
    @NameInMap("CreationDate")
    private String creationDate;

    @NameInMap("ExtranetEndpoint")
    private String extranetEndpoint;

    @NameInMap("IntranetEndpoint")
    private String intranetEndpoint;

    @NameInMap("Location")
    private String location;

    @NameInMap("Name")
    private String name;

    @NameInMap("Region")
    private String region;

    @NameInMap("StorageClass")
    private StorageClass storageClass;


    private Bucket(Builder builder) {
        this.creationDate = builder.creationDate;
        this.extranetEndpoint = builder.extranetEndpoint;
        this.intranetEndpoint = builder.intranetEndpoint;
        this.location = builder.location;
        this.name = builder.name;
        this.region = builder.region;
        this.storageClass = builder.storageClass;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Bucket create() {
        return builder().build();
    }

    /**
     * @return creationDate
     */
    public String getCreationDate() {
        return this.creationDate;
    }

    /**
     * @return extranetEndpoint
     */
    public String getExtranetEndpoint() {
        return this.extranetEndpoint;
    }

    /**
     * @return intranetEndpoint
     */
    public String getIntranetEndpoint() {
        return this.intranetEndpoint;
    }

    /**
     * @return location
     */
    public String getLocation() {
        return this.location;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return region
     */
    public String getRegion() {
        return this.region;
    }

    /**
     * @return storageClass
     */
    public StorageClass getStorageClass() {
        return this.storageClass;
    }

    public static final class Builder {
        private String creationDate; 
        private String extranetEndpoint; 
        private String intranetEndpoint; 
        private String location; 
        private String name; 
        private String region; 
        private StorageClass storageClass; 

        /**
         * <p>The time when the bucket is created.</p>
         */
        public Builder creationDate(String creationDate) {
            this.creationDate = creationDate;
            return this;
        }

        /**
         * <p>The public endpoint used to access the bucket over the Internet.</p>
         */
        public Builder extranetEndpoint(String extranetEndpoint) {
            this.extranetEndpoint = extranetEndpoint;
            return this;
        }

        /**
         * <p>The internal endpoint used to access the bucket from ECS instances in the same region.</p>
         */
        public Builder intranetEndpoint(String intranetEndpoint) {
            this.intranetEndpoint = intranetEndpoint;
            return this;
        }

        /**
         * <p>The data center in which the bucket is located.</p>
         */
        public Builder location(String location) {
            this.location = location;
            return this;
        }

        /**
         * <p>The name of the bucket.</p>
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * <p>The physical location of the bucket.</p>
         */
        public Builder region(String region) {
            this.region = region;
            return this;
        }

        /**
         * <p>StorageClass.</p>
         */
        public Builder storageClass(StorageClass storageClass) {
            this.storageClass = storageClass;
            return this;
        }

        public Bucket build() {
            return new Bucket(this);
        } 

    } 

}
