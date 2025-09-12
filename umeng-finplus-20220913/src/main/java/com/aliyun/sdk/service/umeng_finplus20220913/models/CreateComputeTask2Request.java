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
 * {@link CreateComputeTask2Request} extends {@link RequestModel}
 *
 * <p>CreateComputeTask2Request</p>
 */
public class CreateComputeTask2Request extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("appId")
    private Long appId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("clientId")
    private Long clientId;

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
    @com.aliyun.core.annotation.NameInMap("taskSource")
    private String taskSource;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("type")
    private String type;

    private CreateComputeTask2Request(Builder builder) {
        super(builder);
        this.appId = builder.appId;
        this.clientId = builder.clientId;
        this.dataSetIds = builder.dataSetIds;
        this.morseInfoList = builder.morseInfoList;
        this.name = builder.name;
        this.remarks = builder.remarks;
        this.taskSource = builder.taskSource;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateComputeTask2Request create() {
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
     * @return clientId
     */
    public Long getClientId() {
        return this.clientId;
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
     * @return taskSource
     */
    public String getTaskSource() {
        return this.taskSource;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<CreateComputeTask2Request, Builder> {
        private Long appId; 
        private Long clientId; 
        private String dataSetIds; 
        private java.util.List<MorseInfoList> morseInfoList; 
        private String name; 
        private String remarks; 
        private String taskSource; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(CreateComputeTask2Request request) {
            super(request);
            this.appId = request.appId;
            this.clientId = request.clientId;
            this.dataSetIds = request.dataSetIds;
            this.morseInfoList = request.morseInfoList;
            this.name = request.name;
            this.remarks = request.remarks;
            this.taskSource = request.taskSource;
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
         * clientId.
         */
        public Builder clientId(Long clientId) {
            this.putBodyParameter("clientId", clientId);
            this.clientId = clientId;
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
         * taskSource.
         */
        public Builder taskSource(String taskSource) {
            this.putBodyParameter("taskSource", taskSource);
            this.taskSource = taskSource;
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
        public CreateComputeTask2Request build() {
            return new CreateComputeTask2Request(this);
        } 

    } 

    /**
     * 
     * {@link CreateComputeTask2Request} extends {@link TeaModel}
     *
     * <p>CreateComputeTask2Request</p>
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
