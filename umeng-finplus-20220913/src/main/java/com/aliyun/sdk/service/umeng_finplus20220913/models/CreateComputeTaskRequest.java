// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.umeng_finplus20220913.models;

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
 * {@link CreateComputeTaskRequest} extends {@link RequestModel}
 *
 * <p>CreateComputeTaskRequest</p>
 */
public class CreateComputeTaskRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("appId")
    private Long appId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("dataSetIds")
    private String dataSetIds;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("morseInfoList")
    private java.util.List<MorseInfoList> morseInfoList;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("name")
    private String name;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("remarks")
    private String remarks;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("type")
    private String type;

    private CreateComputeTaskRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
        this.dataSetIds = builder.dataSetIds;
        this.morseInfoList = builder.morseInfoList;
        this.name = builder.name;
        this.remarks = builder.remarks;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateComputeTaskRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appId
     */
    public Long getAppId() {
        return this.appId;
    }

    /**
     * @return dataSetIds
     */
    public String getDataSetIds() {
        return this.dataSetIds;
    }

    /**
     * @return morseInfoList
     */
    public java.util.List<MorseInfoList> getMorseInfoList() {
        return this.morseInfoList;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return remarks
     */
    public String getRemarks() {
        return this.remarks;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<CreateComputeTaskRequest, Builder> {
        private Long appId; 
        private String dataSetIds; 
        private java.util.List<MorseInfoList> morseInfoList; 
        private String name; 
        private String remarks; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(CreateComputeTaskRequest request) {
            super(request);
            this.appId = request.appId;
            this.dataSetIds = request.dataSetIds;
            this.morseInfoList = request.morseInfoList;
            this.name = request.name;
            this.remarks = request.remarks;
            this.type = request.type;
        } 

        /**
         * appId.
         */
        public Builder appId(Long appId) {
            this.putBodyParameter("appId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * dataSetIds.
         */
        public Builder dataSetIds(String dataSetIds) {
            this.putBodyParameter("dataSetIds", dataSetIds);
            this.dataSetIds = dataSetIds;
            return this;
        }

        /**
         * morseInfoList.
         */
        public Builder morseInfoList(java.util.List<MorseInfoList> morseInfoList) {
            this.putBodyParameter("morseInfoList", morseInfoList);
            this.morseInfoList = morseInfoList;
            return this;
        }

        /**
         * name.
         */
        public Builder name(String name) {
            this.putBodyParameter("name", name);
            this.name = name;
            return this;
        }

        /**
         * remarks.
         */
        public Builder remarks(String remarks) {
            this.putBodyParameter("remarks", remarks);
            this.remarks = remarks;
            return this;
        }

        /**
         * type.
         */
        public Builder type(String type) {
            this.putBodyParameter("type", type);
            this.type = type;
            return this;
        }

        @Override
        public CreateComputeTaskRequest build() {
            return new CreateComputeTaskRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateComputeTaskRequest} extends {@link TeaModel}
     *
     * <p>CreateComputeTaskRequest</p>
     */
    public static class MorseInfoList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("cuId")
        private String cuId;

        @com.aliyun.core.annotation.NameInMap("cuVersion")
        private String cuVersion;

        private MorseInfoList(Builder builder) {
            this.cuId = builder.cuId;
            this.cuVersion = builder.cuVersion;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MorseInfoList create() {
            return builder().build();
        }

        /**
         * @return cuId
         */
        public String getCuId() {
            return this.cuId;
        }

        /**
         * @return cuVersion
         */
        public String getCuVersion() {
            return this.cuVersion;
        }

        public static final class Builder {
            private String cuId; 
            private String cuVersion; 

            private Builder() {
            } 

            private Builder(MorseInfoList model) {
                this.cuId = model.cuId;
                this.cuVersion = model.cuVersion;
            } 

            /**
             * cuId.
             */
            public Builder cuId(String cuId) {
                this.cuId = cuId;
                return this;
            }

            /**
             * cuVersion.
             */
            public Builder cuVersion(String cuVersion) {
                this.cuVersion = cuVersion;
                return this;
            }

            public MorseInfoList build() {
                return new MorseInfoList(this);
            } 

        } 

    }
}
