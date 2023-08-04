// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteTraceAppRequest} extends {@link RequestModel}
 *
 * <p>DeleteTraceAppRequest</p>
 */
public class DeleteTraceAppRequest extends Request {
    @Query
    @NameInMap("AppId")
    @Validation(required = true)
    private String appId;

    @Query
    @NameInMap("DeleteReason")
    private DeleteReason deleteReason;

    @Query
    @NameInMap("Pid")
    @Validation(required = true)
    private String pid;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("Type")
    @Validation(required = true)
    private String type;

    private DeleteTraceAppRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
        this.deleteReason = builder.deleteReason;
        this.pid = builder.pid;
        this.regionId = builder.regionId;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteTraceAppRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appId
     */
    public String getAppId() {
        return this.appId;
    }

    /**
     * @return deleteReason
     */
    public DeleteReason getDeleteReason() {
        return this.deleteReason;
    }

    /**
     * @return pid
     */
    public String getPid() {
        return this.pid;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<DeleteTraceAppRequest, Builder> {
        private String appId; 
        private DeleteReason deleteReason; 
        private String pid; 
        private String regionId; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(DeleteTraceAppRequest request) {
            super(request);
            this.appId = request.appId;
            this.deleteReason = request.deleteReason;
            this.pid = request.pid;
            this.regionId = request.regionId;
            this.type = request.type;
        } 

        /**
         * The ID of the application that you want to delete. You can call the SearchTraceAppByName operation to query the application ID. For more information, see [SearchTraceAppByName](~~130676~~).
         */
        public Builder appId(String appId) {
            this.putQueryParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * DeleteReason.
         */
        public Builder deleteReason(DeleteReason deleteReason) {
            String deleteReasonShrink = shrink(deleteReason, "DeleteReason", "json");
            this.putQueryParameter("DeleteReason", deleteReasonShrink);
            this.deleteReason = deleteReason;
            return this;
        }

        /**
         * The PID of the application that you want to delete. For more information about how to obtain the PID, see [Obtain the PID of an application](https://www.alibabacloud.com/help/zh/doc-detail/186100.htm?spm=a2cdw.13409063.0.0.7a72281f0bkTfx#title-imy-7gj-qhr).
         */
        public Builder pid(String pid) {
            this.putQueryParameter("Pid", pid);
            this.pid = pid;
            return this;
        }

        /**
         * The ID of the region.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The type of the application that you want to delete. You can call the SearchTraceAppByName operation to query the application type. For more information, see [SearchTraceAppByName](~~130676~~). Valid values:
         * <p>
         * 
         * *   `TRACE`: application monitoring
         * *   `RETCODE`: frontend monitoring
         */
        public Builder type(String type) {
            this.putQueryParameter("Type", type);
            this.type = type;
            return this;
        }

        @Override
        public DeleteTraceAppRequest build() {
            return new DeleteTraceAppRequest(this);
        } 

    } 

    public static class ReasonIds extends TeaModel {
        @NameInMap("Id")
        private Integer id;

        @NameInMap("Name")
        private String name;

        private ReasonIds(Builder builder) {
            this.id = builder.id;
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ReasonIds create() {
            return builder().build();
        }

        /**
         * @return id
         */
        public Integer getId() {
            return this.id;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        public static final class Builder {
            private Integer id; 
            private String name; 

            /**
             * Id.
             */
            public Builder id(Integer id) {
                this.id = id;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public ReasonIds build() {
                return new ReasonIds(this);
            } 

        } 

    }
    public static class DeleteReason extends TeaModel {
        @NameInMap("ReasonIds")
        private java.util.List < ReasonIds> reasonIds;

        @NameInMap("Remark")
        private String remark;

        private DeleteReason(Builder builder) {
            this.reasonIds = builder.reasonIds;
            this.remark = builder.remark;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DeleteReason create() {
            return builder().build();
        }

        /**
         * @return reasonIds
         */
        public java.util.List < ReasonIds> getReasonIds() {
            return this.reasonIds;
        }

        /**
         * @return remark
         */
        public String getRemark() {
            return this.remark;
        }

        public static final class Builder {
            private java.util.List < ReasonIds> reasonIds; 
            private String remark; 

            /**
             * ReasonIds.
             */
            public Builder reasonIds(java.util.List < ReasonIds> reasonIds) {
                this.reasonIds = reasonIds;
                return this;
            }

            /**
             * Remark.
             */
            public Builder remark(String remark) {
                this.remark = remark;
                return this;
            }

            public DeleteReason build() {
                return new DeleteReason(this);
            } 

        } 

    }
}
