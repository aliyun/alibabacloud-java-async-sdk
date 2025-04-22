// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pds20220301.models;

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
 * {@link AddressGroup} extends {@link TeaModel}
 *
 * <p>AddressGroup</p>
 */
public class AddressGroup extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("address_detail")
    private Address addressDetail;

    @com.aliyun.core.annotation.NameInMap("count")
    private Long count;

    @com.aliyun.core.annotation.NameInMap("cover_file_id")
    private String coverFileId;

    @com.aliyun.core.annotation.NameInMap("cover_url")
    private String coverUrl;

    @com.aliyun.core.annotation.NameInMap("location")
    private String location;

    @com.aliyun.core.annotation.NameInMap("name")
    private String name;

    private AddressGroup(Builder builder) {
        this.addressDetail = builder.addressDetail;
        this.count = builder.count;
        this.coverFileId = builder.coverFileId;
        this.coverUrl = builder.coverUrl;
        this.location = builder.location;
        this.name = builder.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddressGroup create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return addressDetail
     */
    public Address getAddressDetail() {
        return this.addressDetail;
    }

    /**
     * @return count
     */
    public Long getCount() {
        return this.count;
    }

    /**
     * @return coverFileId
     */
    public String getCoverFileId() {
        return this.coverFileId;
    }

    /**
     * @return coverUrl
     */
    public String getCoverUrl() {
        return this.coverUrl;
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

    public static final class Builder {
        private Address addressDetail; 
        private Long count; 
        private String coverFileId; 
        private String coverUrl; 
        private String location; 
        private String name; 

        private Builder() {
        } 

        private Builder(AddressGroup model) {
            this.addressDetail = model.addressDetail;
            this.count = model.count;
            this.coverFileId = model.coverFileId;
            this.coverUrl = model.coverUrl;
            this.location = model.location;
            this.name = model.name;
        } 

        /**
         * address_detail.
         */
        public Builder addressDetail(Address addressDetail) {
            this.addressDetail = addressDetail;
            return this;
        }

        /**
         * count.
         */
        public Builder count(Long count) {
            this.count = count;
            return this;
        }

        /**
         * cover_file_id.
         */
        public Builder coverFileId(String coverFileId) {
            this.coverFileId = coverFileId;
            return this;
        }

        /**
         * cover_url.
         */
        public Builder coverUrl(String coverUrl) {
            this.coverUrl = coverUrl;
            return this;
        }

        /**
         * location.
         */
        public Builder location(String location) {
            this.location = location;
            return this;
        }

        /**
         * name.
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public AddressGroup build() {
            return new AddressGroup(this);
        } 

    } 

}
