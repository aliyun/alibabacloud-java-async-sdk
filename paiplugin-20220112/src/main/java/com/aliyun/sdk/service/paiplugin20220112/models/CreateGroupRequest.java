// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paiplugin20220112.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateGroupRequest} extends {@link RequestModel}
 *
 * <p>CreateGroupRequest</p>
 */
public class CreateGroupRequest extends Request {
    @Body
    @NameInMap("Algorithm")
    private String algorithm;

    @Body
    @NameInMap("Column")
    private String column;

    @Body
    @NameInMap("Filter")
    private String filter;

    @Body
    @NameInMap("InferenceJobId")
    private String inferenceJobId;

    @Body
    @NameInMap("Name")
    private String name;

    @Body
    @NameInMap("PhoneNumber")
    private Boolean phoneNumber;

    @Body
    @NameInMap("Project")
    private String project;

    @Body
    @NameInMap("Remark")
    private String remark;

    @Body
    @NameInMap("Source")
    private Integer source;

    @Body
    @NameInMap("Table")
    private String table;

    @Body
    @NameInMap("Text")
    private String text;

    @Body
    @NameInMap("Uri")
    private String uri;

    private CreateGroupRequest(Builder builder) {
        super(builder);
        this.algorithm = builder.algorithm;
        this.column = builder.column;
        this.filter = builder.filter;
        this.inferenceJobId = builder.inferenceJobId;
        this.name = builder.name;
        this.phoneNumber = builder.phoneNumber;
        this.project = builder.project;
        this.remark = builder.remark;
        this.source = builder.source;
        this.table = builder.table;
        this.text = builder.text;
        this.uri = builder.uri;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateGroupRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return algorithm
     */
    public String getAlgorithm() {
        return this.algorithm;
    }

    /**
     * @return column
     */
    public String getColumn() {
        return this.column;
    }

    /**
     * @return filter
     */
    public String getFilter() {
        return this.filter;
    }

    /**
     * @return inferenceJobId
     */
    public String getInferenceJobId() {
        return this.inferenceJobId;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return phoneNumber
     */
    public Boolean getPhoneNumber() {
        return this.phoneNumber;
    }

    /**
     * @return project
     */
    public String getProject() {
        return this.project;
    }

    /**
     * @return remark
     */
    public String getRemark() {
        return this.remark;
    }

    /**
     * @return source
     */
    public Integer getSource() {
        return this.source;
    }

    /**
     * @return table
     */
    public String getTable() {
        return this.table;
    }

    /**
     * @return text
     */
    public String getText() {
        return this.text;
    }

    /**
     * @return uri
     */
    public String getUri() {
        return this.uri;
    }

    public static final class Builder extends Request.Builder<CreateGroupRequest, Builder> {
        private String algorithm; 
        private String column; 
        private String filter; 
        private String inferenceJobId; 
        private String name; 
        private Boolean phoneNumber; 
        private String project; 
        private String remark; 
        private Integer source; 
        private String table; 
        private String text; 
        private String uri; 

        private Builder() {
            super();
        } 

        private Builder(CreateGroupRequest request) {
            super(request);
            this.algorithm = request.algorithm;
            this.column = request.column;
            this.filter = request.filter;
            this.inferenceJobId = request.inferenceJobId;
            this.name = request.name;
            this.phoneNumber = request.phoneNumber;
            this.project = request.project;
            this.remark = request.remark;
            this.source = request.source;
            this.table = request.table;
            this.text = request.text;
            this.uri = request.uri;
        } 

        /**
         * 关联算法，人群来源为算法。
         */
        public Builder algorithm(String algorithm) {
            this.putBodyParameter("Algorithm", algorithm);
            this.algorithm = algorithm;
            return this;
        }

        /**
         * 手机号列名，人群来源为CSV文件，MaxCompute，并且包含手机号时需指定。
         */
        public Builder column(String column) {
            this.putBodyParameter("Column", column);
            this.column = column;
            return this;
        }

        /**
         * 过滤条件，人群来源为MaxCompute时可指定。
         */
        public Builder filter(String filter) {
            this.putBodyParameter("Filter", filter);
            this.filter = filter;
            return this;
        }

        /**
         * 预测任务Id，人群来源为算法。
         */
        public Builder inferenceJobId(String inferenceJobId) {
            this.putBodyParameter("InferenceJobId", inferenceJobId);
            this.inferenceJobId = inferenceJobId;
            return this;
        }

        /**
         * 人群名称。
         */
        public Builder name(String name) {
            this.putBodyParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * 是否包含手机号，包含手机号的人群可用于触达计划。
         */
        public Builder phoneNumber(Boolean phoneNumber) {
            this.putBodyParameter("PhoneNumber", phoneNumber);
            this.phoneNumber = phoneNumber;
            return this;
        }

        /**
         * MaxCompute(ODPS)项目名，人群来源为MaxCompute时需指定。
         */
        public Builder project(String project) {
            this.putBodyParameter("Project", project);
            this.project = project;
            return this;
        }

        /**
         * 人群备注。
         */
        public Builder remark(String remark) {
            this.putBodyParameter("Remark", remark);
            this.remark = remark;
            return this;
        }

        /**
         * 人群来源。
         * <p>
         * - 0: 文本，每行一个手机号，最多100个。
         * - 1: 文本文件，每行一个手机号，可通过控制台上传或指定自定义OSS地址，指定自定义OSS地址前需确保已在控制台完成一键授权。
         * - 2: CSV文件，需指定手机号列名，可通过控制台上传或指定自定义OSS地址，指定自定义OSS地址前需确保已在控制台完成一键授权。
         * - 3: MaxCompute(ODPS)表，需指定手机号列名。
         * - 4: 算法。
         */
        public Builder source(Integer source) {
            this.putBodyParameter("Source", source);
            this.source = source;
            return this;
        }

        /**
         * MaxCompute(ODPS)表名，人群来源为MaxCompute时需指定。
         */
        public Builder table(String table) {
            this.putBodyParameter("Table", table);
            this.table = table;
            return this;
        }

        /**
         * 文本，人群来源为文本时需指定。
         */
        public Builder text(String text) {
            this.putBodyParameter("Text", text);
            this.text = text;
            return this;
        }

        /**
         * 文件地址，人群来源为文本文件，CSV文件，MaxCompute时需指定。
         */
        public Builder uri(String uri) {
            this.putBodyParameter("Uri", uri);
            this.uri = uri;
            return this;
        }

        @Override
        public CreateGroupRequest build() {
            return new CreateGroupRequest(this);
        } 

    } 

}
