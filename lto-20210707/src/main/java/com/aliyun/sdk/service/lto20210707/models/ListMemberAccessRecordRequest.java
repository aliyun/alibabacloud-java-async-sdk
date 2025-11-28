// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.lto20210707.models;

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
 * {@link ListMemberAccessRecordRequest} extends {@link RequestModel}
 *
 * <p>ListMemberAccessRecordRequest</p>
 */
public class ListMemberAccessRecordRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AccessStatus")
    private String accessStatus;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Contactor")
    private String contactor;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Num")
    @com.aliyun.core.annotation.Validation(required = true, maximum = 2147483647, minimum = 1)
    private Long num;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Size")
    @com.aliyun.core.annotation.Validation(required = true, maximum = 2147483647, minimum = 1)
    private Long size;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Uid")
    private String uid;

    private ListMemberAccessRecordRequest(Builder builder) {
        super(builder);
        this.accessStatus = builder.accessStatus;
        this.contactor = builder.contactor;
        this.name = builder.name;
        this.num = builder.num;
        this.regionId = builder.regionId;
        this.size = builder.size;
        this.uid = builder.uid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListMemberAccessRecordRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accessStatus
     */
    public String getAccessStatus() {
        return this.accessStatus;
    }

    /**
     * @return contactor
     */
    public String getContactor() {
        return this.contactor;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return num
     */
    public Long getNum() {
        return this.num;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return size
     */
    public Long getSize() {
        return this.size;
    }

    /**
     * @return uid
     */
    public String getUid() {
        return this.uid;
    }

    public static final class Builder extends Request.Builder<ListMemberAccessRecordRequest, Builder> {
        private String accessStatus; 
        private String contactor; 
        private String name; 
        private Long num; 
        private String regionId; 
        private Long size; 
        private String uid; 

        private Builder() {
            super();
        } 

        private Builder(ListMemberAccessRecordRequest request) {
            super(request);
            this.accessStatus = request.accessStatus;
            this.contactor = request.contactor;
            this.name = request.name;
            this.num = request.num;
            this.regionId = request.regionId;
            this.size = request.size;
            this.uid = request.uid;
        } 

        /**
         * AccessStatus.
         */
        public Builder accessStatus(String accessStatus) {
            this.putQueryParameter("AccessStatus", accessStatus);
            this.accessStatus = accessStatus;
            return this;
        }

        /**
         * Contactor.
         */
        public Builder contactor(String contactor) {
            this.putQueryParameter("Contactor", contactor);
            this.contactor = contactor;
            return this;
        }

        /**
         * Name.
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder num(Long num) {
            this.putQueryParameter("Num", num);
            this.num = num;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder size(Long size) {
            this.putQueryParameter("Size", size);
            this.size = size;
            return this;
        }

        /**
         * Uid.
         */
        public Builder uid(String uid) {
            this.putQueryParameter("Uid", uid);
            this.uid = uid;
            return this;
        }

        @Override
        public ListMemberAccessRecordRequest build() {
            return new ListMemberAccessRecordRequest(this);
        } 

    } 

}
