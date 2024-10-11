// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20200701.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ImportDoNotCallNumbersRequest} extends {@link RequestModel}
 *
 * <p>ImportDoNotCallNumbersRequest</p>
 */
public class ImportDoNotCallNumbersRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FilePath")
    private String filePath;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NumberList")
    private String numberList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Remark")
    private String remark;

    private ImportDoNotCallNumbersRequest(Builder builder) {
        super(builder);
        this.filePath = builder.filePath;
        this.instanceId = builder.instanceId;
        this.numberList = builder.numberList;
        this.remark = builder.remark;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ImportDoNotCallNumbersRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return filePath
     */
    public String getFilePath() {
        return this.filePath;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return numberList
     */
    public String getNumberList() {
        return this.numberList;
    }

    /**
     * @return remark
     */
    public String getRemark() {
        return this.remark;
    }

    public static final class Builder extends Request.Builder<ImportDoNotCallNumbersRequest, Builder> {
        private String filePath; 
        private String instanceId; 
        private String numberList; 
        private String remark; 

        private Builder() {
            super();
        } 

        private Builder(ImportDoNotCallNumbersRequest request) {
            super(request);
            this.filePath = request.filePath;
            this.instanceId = request.instanceId;
            this.numberList = request.numberList;
            this.remark = request.remark;
        } 

        /**
         * FilePath.
         */
        public Builder filePath(String filePath) {
            this.putQueryParameter("FilePath", filePath);
            this.filePath = filePath;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ccc-test</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * NumberList.
         */
        public Builder numberList(String numberList) {
            this.putQueryParameter("NumberList", numberList);
            this.numberList = numberList;
            return this;
        }

        /**
         * Remark.
         */
        public Builder remark(String remark) {
            this.putQueryParameter("Remark", remark);
            this.remark = remark;
            return this;
        }

        @Override
        public ImportDoNotCallNumbersRequest build() {
            return new ImportDoNotCallNumbersRequest(this);
        } 

    } 

}
