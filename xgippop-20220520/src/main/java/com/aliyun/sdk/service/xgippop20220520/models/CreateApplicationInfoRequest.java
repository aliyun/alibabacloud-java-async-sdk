// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.xgippop20220520.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateApplicationInfoRequest} extends {@link RequestModel}
 *
 * <p>CreateApplicationInfoRequest</p>
 */
public class CreateApplicationInfoRequest extends Request {
    @Body
    @NameInMap("AliUid")
    private Long aliUid;

    @Body
    @NameInMap("AppName")
    private String appName;

    @Body
    @NameInMap("AppTypeList")
    private java.util.List < String > appTypeList;

    @Body
    @NameInMap("AppingList")
    private java.util.List < AppingList> appingList;

    @Body
    @NameInMap("ItemCode")
    private String itemCode;

    private CreateApplicationInfoRequest(Builder builder) {
        super(builder);
        this.aliUid = builder.aliUid;
        this.appName = builder.appName;
        this.appTypeList = builder.appTypeList;
        this.appingList = builder.appingList;
        this.itemCode = builder.itemCode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateApplicationInfoRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return aliUid
     */
    public Long getAliUid() {
        return this.aliUid;
    }

    /**
     * @return appName
     */
    public String getAppName() {
        return this.appName;
    }

    /**
     * @return appTypeList
     */
    public java.util.List < String > getAppTypeList() {
        return this.appTypeList;
    }

    /**
     * @return appingList
     */
    public java.util.List < AppingList> getAppingList() {
        return this.appingList;
    }

    /**
     * @return itemCode
     */
    public String getItemCode() {
        return this.itemCode;
    }

    public static final class Builder extends Request.Builder<CreateApplicationInfoRequest, Builder> {
        private Long aliUid; 
        private String appName; 
        private java.util.List < String > appTypeList; 
        private java.util.List < AppingList> appingList; 
        private String itemCode; 

        private Builder() {
            super();
        } 

        private Builder(CreateApplicationInfoRequest request) {
            super(request);
            this.aliUid = request.aliUid;
            this.appName = request.appName;
            this.appTypeList = request.appTypeList;
            this.appingList = request.appingList;
            this.itemCode = request.itemCode;
        } 

        /**
         * 阿里UID
         */
        public Builder aliUid(Long aliUid) {
            this.putBodyParameter("AliUid", aliUid);
            this.aliUid = aliUid;
            return this;
        }

        /**
         * 应用名称
         */
        public Builder appName(String appName) {
            this.putBodyParameter("AppName", appName);
            this.appName = appName;
            return this;
        }

        /**
         * dynamic（动态业务）/static（静态业务
         */
        public Builder appTypeList(java.util.List < String > appTypeList) {
            this.putBodyParameter("AppTypeList", appTypeList);
            this.appTypeList = appTypeList;
            return this;
        }

        /**
         * AppingList.
         */
        public Builder appingList(java.util.List < AppingList> appingList) {
            this.putBodyParameter("AppingList", appingList);
            this.appingList = appingList;
            return this;
        }

        /**
         * 商品code
         */
        public Builder itemCode(String itemCode) {
            this.putBodyParameter("ItemCode", itemCode);
            this.itemCode = itemCode;
            return this;
        }

        @Override
        public CreateApplicationInfoRequest build() {
            return new CreateApplicationInfoRequest(this);
        } 

    } 

    public static class AppingList extends TeaModel {
        @NameInMap("ExtId")
        private Long extId;

        @NameInMap("FlowIp")
        private java.util.List < String > flowIp;

        @NameInMap("FlowUrl")
        private java.util.List < String > flowUrl;

        @NameInMap("OriginalIpList")
        private java.util.List < String > originalIpList;

        @NameInMap("OriginalUrlList")
        private java.util.List < String > originalUrlList;

        private AppingList(Builder builder) {
            this.extId = builder.extId;
            this.flowIp = builder.flowIp;
            this.flowUrl = builder.flowUrl;
            this.originalIpList = builder.originalIpList;
            this.originalUrlList = builder.originalUrlList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AppingList create() {
            return builder().build();
        }

        /**
         * @return extId
         */
        public Long getExtId() {
            return this.extId;
        }

        /**
         * @return flowIp
         */
        public java.util.List < String > getFlowIp() {
            return this.flowIp;
        }

        /**
         * @return flowUrl
         */
        public java.util.List < String > getFlowUrl() {
            return this.flowUrl;
        }

        /**
         * @return originalIpList
         */
        public java.util.List < String > getOriginalIpList() {
            return this.originalIpList;
        }

        /**
         * @return originalUrlList
         */
        public java.util.List < String > getOriginalUrlList() {
            return this.originalUrlList;
        }

        public static final class Builder {
            private Long extId; 
            private java.util.List < String > flowIp; 
            private java.util.List < String > flowUrl; 
            private java.util.List < String > originalIpList; 
            private java.util.List < String > originalUrlList; 

            /**
             * ExtId.
             */
            public Builder extId(Long extId) {
                this.extId = extId;
                return this;
            }

            /**
             * cdn ip
             */
            public Builder flowIp(java.util.List < String > flowIp) {
                this.flowIp = flowIp;
                return this;
            }

            /**
             * cdn 域名信息
             */
            public Builder flowUrl(java.util.List < String > flowUrl) {
                this.flowUrl = flowUrl;
                return this;
            }

            /**
             * 业务方ip集合
             */
            public Builder originalIpList(java.util.List < String > originalIpList) {
                this.originalIpList = originalIpList;
                return this;
            }

            /**
             * 业务方域名集合
             */
            public Builder originalUrlList(java.util.List < String > originalUrlList) {
                this.originalUrlList = originalUrlList;
                return this;
            }

            public AppingList build() {
                return new AppingList(this);
            } 

        } 

    }
}
