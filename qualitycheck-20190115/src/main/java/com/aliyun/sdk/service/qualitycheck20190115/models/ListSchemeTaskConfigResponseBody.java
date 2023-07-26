// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.qualitycheck20190115.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListSchemeTaskConfigResponseBody} extends {@link TeaModel}
 *
 * <p>ListSchemeTaskConfigResponseBody</p>
 */
public class ListSchemeTaskConfigResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Count")
    private Integer count;

    @NameInMap("CurrentPage")
    private Integer currentPage;

    @NameInMap("Data")
    private Data data;

    @NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @NameInMap("LastDataId")
    private String lastDataId;

    @NameInMap("Message")
    private String message;

    @NameInMap("Messages")
    private Messages messages;

    @NameInMap("PageNumber")
    private Integer pageNumber;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("ResultCountId")
    private String resultCountId;

    @NameInMap("Success")
    private Boolean success;

    private ListSchemeTaskConfigResponseBody(Builder builder) {
        this.code = builder.code;
        this.count = builder.count;
        this.currentPage = builder.currentPage;
        this.data = builder.data;
        this.httpStatusCode = builder.httpStatusCode;
        this.lastDataId = builder.lastDataId;
        this.message = builder.message;
        this.messages = builder.messages;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.resultCountId = builder.resultCountId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListSchemeTaskConfigResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return count
     */
    public Integer getCount() {
        return this.count;
    }

    /**
     * @return currentPage
     */
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    /**
     * @return lastDataId
     */
    public String getLastDataId() {
        return this.lastDataId;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return messages
     */
    public Messages getMessages() {
        return this.messages;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return resultCountId
     */
    public String getResultCountId() {
        return this.resultCountId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private Integer count; 
        private Integer currentPage; 
        private Data data; 
        private Integer httpStatusCode; 
        private String lastDataId; 
        private String message; 
        private Messages messages; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private String resultCountId; 
        private Boolean success; 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Count.
         */
        public Builder count(Integer count) {
            this.count = count;
            return this;
        }

        /**
         * CurrentPage.
         */
        public Builder currentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * HttpStatusCode.
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * LastDataId.
         */
        public Builder lastDataId(String lastDataId) {
            this.lastDataId = lastDataId;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * Messages.
         */
        public Builder messages(Messages messages) {
            this.messages = messages;
            return this;
        }

        /**
         * PageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * ResultCountId.
         */
        public Builder resultCountId(String resultCountId) {
            this.resultCountId = resultCountId;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public ListSchemeTaskConfigResponseBody build() {
            return new ListSchemeTaskConfigResponseBody(this);
        } 

    } 

    public static class ListObject extends TeaModel {
        @NameInMap("ListObject")
        private java.util.List < ? > listObject;

        private ListObject(Builder builder) {
            this.listObject = builder.listObject;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ListObject create() {
            return builder().build();
        }

        /**
         * @return listObject
         */
        public java.util.List < ? > getListObject() {
            return this.listObject;
        }

        public static final class Builder {
            private java.util.List < ? > listObject; 

            /**
             * ListObject.
             */
            public Builder listObject(java.util.List < ? > listObject) {
                this.listObject = listObject;
                return this;
            }

            public ListObject build() {
                return new ListObject(this);
            } 

        } 

    }
    public static class AssignConfigContest extends TeaModel {
        @NameInMap("DataType")
        private Integer dataType;

        @NameInMap("ListObject")
        private ListObject listObject;

        @NameInMap("Name")
        private String name;

        @NameInMap("Symbol")
        private Integer symbol;

        @NameInMap("Value")
        private String value;

        private AssignConfigContest(Builder builder) {
            this.dataType = builder.dataType;
            this.listObject = builder.listObject;
            this.name = builder.name;
            this.symbol = builder.symbol;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AssignConfigContest create() {
            return builder().build();
        }

        /**
         * @return dataType
         */
        public Integer getDataType() {
            return this.dataType;
        }

        /**
         * @return listObject
         */
        public ListObject getListObject() {
            return this.listObject;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return symbol
         */
        public Integer getSymbol() {
            return this.symbol;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private Integer dataType; 
            private ListObject listObject; 
            private String name; 
            private Integer symbol; 
            private String value; 

            /**
             * DataType.
             */
            public Builder dataType(Integer dataType) {
                this.dataType = dataType;
                return this;
            }

            /**
             * ListObject.
             */
            public Builder listObject(ListObject listObject) {
                this.listObject = listObject;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * Symbol.
             */
            public Builder symbol(Integer symbol) {
                this.symbol = symbol;
                return this;
            }

            /**
             * Value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public AssignConfigContest build() {
                return new AssignConfigContest(this);
            } 

        } 

    }
    public static class AssignConfigContests extends TeaModel {
        @NameInMap("AssignConfigContest")
        private java.util.List < AssignConfigContest> assignConfigContest;

        private AssignConfigContests(Builder builder) {
            this.assignConfigContest = builder.assignConfigContest;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AssignConfigContests create() {
            return builder().build();
        }

        /**
         * @return assignConfigContest
         */
        public java.util.List < AssignConfigContest> getAssignConfigContest() {
            return this.assignConfigContest;
        }

        public static final class Builder {
            private java.util.List < AssignConfigContest> assignConfigContest; 

            /**
             * AssignConfigContest.
             */
            public Builder assignConfigContest(java.util.List < AssignConfigContest> assignConfigContest) {
                this.assignConfigContest = assignConfigContest;
                return this;
            }

            public AssignConfigContests build() {
                return new AssignConfigContests(this);
            } 

        } 

    }
    public static class AssignConfig extends TeaModel {
        @NameInMap("AssignConfigContests")
        private AssignConfigContests assignConfigContests;

        private AssignConfig(Builder builder) {
            this.assignConfigContests = builder.assignConfigContests;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AssignConfig create() {
            return builder().build();
        }

        /**
         * @return assignConfigContests
         */
        public AssignConfigContests getAssignConfigContests() {
            return this.assignConfigContests;
        }

        public static final class Builder {
            private AssignConfigContests assignConfigContests; 

            /**
             * AssignConfigContests.
             */
            public Builder assignConfigContests(AssignConfigContests assignConfigContests) {
                this.assignConfigContests = assignConfigContests;
                return this;
            }

            public AssignConfig build() {
                return new AssignConfig(this);
            } 

        } 

    }
    public static class AssignConfigs extends TeaModel {
        @NameInMap("AssignConfig")
        private java.util.List < AssignConfig> assignConfig;

        private AssignConfigs(Builder builder) {
            this.assignConfig = builder.assignConfig;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AssignConfigs create() {
            return builder().build();
        }

        /**
         * @return assignConfig
         */
        public java.util.List < AssignConfig> getAssignConfig() {
            return this.assignConfig;
        }

        public static final class Builder {
            private java.util.List < AssignConfig> assignConfig; 

            /**
             * AssignConfig.
             */
            public Builder assignConfig(java.util.List < AssignConfig> assignConfig) {
                this.assignConfig = assignConfig;
                return this;
            }

            public AssignConfigs build() {
                return new AssignConfigs(this);
            } 

        } 

    }
    public static class DataConfig extends TeaModel {
        @NameInMap("AssignConfigs")
        private AssignConfigs assignConfigs;

        @NameInMap("DataSets")
        private String dataSets;

        @NameInMap("Index")
        private Integer index;

        @NameInMap("ResultParam")
        private String resultParam;

        private DataConfig(Builder builder) {
            this.assignConfigs = builder.assignConfigs;
            this.dataSets = builder.dataSets;
            this.index = builder.index;
            this.resultParam = builder.resultParam;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DataConfig create() {
            return builder().build();
        }

        /**
         * @return assignConfigs
         */
        public AssignConfigs getAssignConfigs() {
            return this.assignConfigs;
        }

        /**
         * @return dataSets
         */
        public String getDataSets() {
            return this.dataSets;
        }

        /**
         * @return index
         */
        public Integer getIndex() {
            return this.index;
        }

        /**
         * @return resultParam
         */
        public String getResultParam() {
            return this.resultParam;
        }

        public static final class Builder {
            private AssignConfigs assignConfigs; 
            private String dataSets; 
            private Integer index; 
            private String resultParam; 

            /**
             * AssignConfigs.
             */
            public Builder assignConfigs(AssignConfigs assignConfigs) {
                this.assignConfigs = assignConfigs;
                return this;
            }

            /**
             * DataSets.
             */
            public Builder dataSets(String dataSets) {
                this.dataSets = dataSets;
                return this;
            }

            /**
             * Index.
             */
            public Builder index(Integer index) {
                this.index = index;
                return this;
            }

            /**
             * ResultParam.
             */
            public Builder resultParam(String resultParam) {
                this.resultParam = resultParam;
                return this;
            }

            public DataConfig build() {
                return new DataConfig(this);
            } 

        } 

    }
    public static class SchemeIdList extends TeaModel {
        @NameInMap("SchemeIdList")
        private java.util.List < Long > schemeIdList;

        private SchemeIdList(Builder builder) {
            this.schemeIdList = builder.schemeIdList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SchemeIdList create() {
            return builder().build();
        }

        /**
         * @return schemeIdList
         */
        public java.util.List < Long > getSchemeIdList() {
            return this.schemeIdList;
        }

        public static final class Builder {
            private java.util.List < Long > schemeIdList; 

            /**
             * SchemeIdList.
             */
            public Builder schemeIdList(java.util.List < Long > schemeIdList) {
                this.schemeIdList = schemeIdList;
                return this;
            }

            public SchemeIdList build() {
                return new SchemeIdList(this);
            } 

        } 

    }
    public static class SchemeList extends TeaModel {
        @NameInMap("Name")
        private String name;

        @NameInMap("SchemeId")
        private Long schemeId;

        private SchemeList(Builder builder) {
            this.name = builder.name;
            this.schemeId = builder.schemeId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SchemeList create() {
            return builder().build();
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return schemeId
         */
        public Long getSchemeId() {
            return this.schemeId;
        }

        public static final class Builder {
            private String name; 
            private Long schemeId; 

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * SchemeId.
             */
            public Builder schemeId(Long schemeId) {
                this.schemeId = schemeId;
                return this;
            }

            public SchemeList build() {
                return new SchemeList(this);
            } 

        } 

    }
    public static class DataSchemeList extends TeaModel {
        @NameInMap("SchemeList")
        private java.util.List < SchemeList> schemeList;

        private DataSchemeList(Builder builder) {
            this.schemeList = builder.schemeList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DataSchemeList create() {
            return builder().build();
        }

        /**
         * @return schemeList
         */
        public java.util.List < SchemeList> getSchemeList() {
            return this.schemeList;
        }

        public static final class Builder {
            private java.util.List < SchemeList> schemeList; 

            /**
             * SchemeList.
             */
            public Builder schemeList(java.util.List < SchemeList> schemeList) {
                this.schemeList = schemeList;
                return this;
            }

            public DataSchemeList build() {
                return new DataSchemeList(this);
            } 

        } 

    }
    public static class DataData extends TeaModel {
        @NameInMap("AsrTaskPriority")
        private Integer asrTaskPriority;

        @NameInMap("AssignType")
        private Integer assignType;

        @NameInMap("CreateTime")
        private String createTime;

        @NameInMap("CreateUser")
        private Long createUser;

        @NameInMap("DataConfig")
        private DataConfig dataConfig;

        @NameInMap("FinishRate")
        private Double finishRate;

        @NameInMap("Id")
        private Long id;

        @NameInMap("ManualReview")
        private Integer manualReview;

        @NameInMap("ModeCustomizationId")
        private String modeCustomizationId;

        @NameInMap("ModelName")
        private String modelName;

        @NameInMap("Name")
        private String name;

        @NameInMap("NumberExecuting")
        private Integer numberExecuting;

        @NameInMap("NumberFail")
        private Integer numberFail;

        @NameInMap("NumberSuccess")
        private Integer numberSuccess;

        @NameInMap("NumberSum")
        private Integer numberSum;

        @NameInMap("SchemeIdList")
        private SchemeIdList schemeIdList;

        @NameInMap("SchemeList")
        private DataSchemeList schemeList;

        @NameInMap("SchemeTaskConfigId")
        private Long schemeTaskConfigId;

        @NameInMap("SourceDataType")
        private Integer sourceDataType;

        @NameInMap("Status")
        private Integer status;

        @NameInMap("Type")
        private Integer type;

        @NameInMap("UpdateTime")
        private String updateTime;

        @NameInMap("UpdateUser")
        private Long updateUser;

        @NameInMap("UserGroup")
        private String userGroup;

        @NameInMap("VocabId")
        private String vocabId;

        @NameInMap("VocabName")
        private String vocabName;

        private DataData(Builder builder) {
            this.asrTaskPriority = builder.asrTaskPriority;
            this.assignType = builder.assignType;
            this.createTime = builder.createTime;
            this.createUser = builder.createUser;
            this.dataConfig = builder.dataConfig;
            this.finishRate = builder.finishRate;
            this.id = builder.id;
            this.manualReview = builder.manualReview;
            this.modeCustomizationId = builder.modeCustomizationId;
            this.modelName = builder.modelName;
            this.name = builder.name;
            this.numberExecuting = builder.numberExecuting;
            this.numberFail = builder.numberFail;
            this.numberSuccess = builder.numberSuccess;
            this.numberSum = builder.numberSum;
            this.schemeIdList = builder.schemeIdList;
            this.schemeList = builder.schemeList;
            this.schemeTaskConfigId = builder.schemeTaskConfigId;
            this.sourceDataType = builder.sourceDataType;
            this.status = builder.status;
            this.type = builder.type;
            this.updateTime = builder.updateTime;
            this.updateUser = builder.updateUser;
            this.userGroup = builder.userGroup;
            this.vocabId = builder.vocabId;
            this.vocabName = builder.vocabName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DataData create() {
            return builder().build();
        }

        /**
         * @return asrTaskPriority
         */
        public Integer getAsrTaskPriority() {
            return this.asrTaskPriority;
        }

        /**
         * @return assignType
         */
        public Integer getAssignType() {
            return this.assignType;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return createUser
         */
        public Long getCreateUser() {
            return this.createUser;
        }

        /**
         * @return dataConfig
         */
        public DataConfig getDataConfig() {
            return this.dataConfig;
        }

        /**
         * @return finishRate
         */
        public Double getFinishRate() {
            return this.finishRate;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return manualReview
         */
        public Integer getManualReview() {
            return this.manualReview;
        }

        /**
         * @return modeCustomizationId
         */
        public String getModeCustomizationId() {
            return this.modeCustomizationId;
        }

        /**
         * @return modelName
         */
        public String getModelName() {
            return this.modelName;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return numberExecuting
         */
        public Integer getNumberExecuting() {
            return this.numberExecuting;
        }

        /**
         * @return numberFail
         */
        public Integer getNumberFail() {
            return this.numberFail;
        }

        /**
         * @return numberSuccess
         */
        public Integer getNumberSuccess() {
            return this.numberSuccess;
        }

        /**
         * @return numberSum
         */
        public Integer getNumberSum() {
            return this.numberSum;
        }

        /**
         * @return schemeIdList
         */
        public SchemeIdList getSchemeIdList() {
            return this.schemeIdList;
        }

        /**
         * @return schemeList
         */
        public DataSchemeList getSchemeList() {
            return this.schemeList;
        }

        /**
         * @return schemeTaskConfigId
         */
        public Long getSchemeTaskConfigId() {
            return this.schemeTaskConfigId;
        }

        /**
         * @return sourceDataType
         */
        public Integer getSourceDataType() {
            return this.sourceDataType;
        }

        /**
         * @return status
         */
        public Integer getStatus() {
            return this.status;
        }

        /**
         * @return type
         */
        public Integer getType() {
            return this.type;
        }

        /**
         * @return updateTime
         */
        public String getUpdateTime() {
            return this.updateTime;
        }

        /**
         * @return updateUser
         */
        public Long getUpdateUser() {
            return this.updateUser;
        }

        /**
         * @return userGroup
         */
        public String getUserGroup() {
            return this.userGroup;
        }

        /**
         * @return vocabId
         */
        public String getVocabId() {
            return this.vocabId;
        }

        /**
         * @return vocabName
         */
        public String getVocabName() {
            return this.vocabName;
        }

        public static final class Builder {
            private Integer asrTaskPriority; 
            private Integer assignType; 
            private String createTime; 
            private Long createUser; 
            private DataConfig dataConfig; 
            private Double finishRate; 
            private Long id; 
            private Integer manualReview; 
            private String modeCustomizationId; 
            private String modelName; 
            private String name; 
            private Integer numberExecuting; 
            private Integer numberFail; 
            private Integer numberSuccess; 
            private Integer numberSum; 
            private SchemeIdList schemeIdList; 
            private DataSchemeList schemeList; 
            private Long schemeTaskConfigId; 
            private Integer sourceDataType; 
            private Integer status; 
            private Integer type; 
            private String updateTime; 
            private Long updateUser; 
            private String userGroup; 
            private String vocabId; 
            private String vocabName; 

            /**
             * AsrTaskPriority.
             */
            public Builder asrTaskPriority(Integer asrTaskPriority) {
                this.asrTaskPriority = asrTaskPriority;
                return this;
            }

            /**
             * AssignType.
             */
            public Builder assignType(Integer assignType) {
                this.assignType = assignType;
                return this;
            }

            /**
             * CreateTime.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * CreateUser.
             */
            public Builder createUser(Long createUser) {
                this.createUser = createUser;
                return this;
            }

            /**
             * DataConfig.
             */
            public Builder dataConfig(DataConfig dataConfig) {
                this.dataConfig = dataConfig;
                return this;
            }

            /**
             * FinishRate.
             */
            public Builder finishRate(Double finishRate) {
                this.finishRate = finishRate;
                return this;
            }

            /**
             * Id.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * ManualReview.
             */
            public Builder manualReview(Integer manualReview) {
                this.manualReview = manualReview;
                return this;
            }

            /**
             * ModeCustomizationId.
             */
            public Builder modeCustomizationId(String modeCustomizationId) {
                this.modeCustomizationId = modeCustomizationId;
                return this;
            }

            /**
             * ModelName.
             */
            public Builder modelName(String modelName) {
                this.modelName = modelName;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * NumberExecuting.
             */
            public Builder numberExecuting(Integer numberExecuting) {
                this.numberExecuting = numberExecuting;
                return this;
            }

            /**
             * NumberFail.
             */
            public Builder numberFail(Integer numberFail) {
                this.numberFail = numberFail;
                return this;
            }

            /**
             * NumberSuccess.
             */
            public Builder numberSuccess(Integer numberSuccess) {
                this.numberSuccess = numberSuccess;
                return this;
            }

            /**
             * NumberSum.
             */
            public Builder numberSum(Integer numberSum) {
                this.numberSum = numberSum;
                return this;
            }

            /**
             * SchemeIdList.
             */
            public Builder schemeIdList(SchemeIdList schemeIdList) {
                this.schemeIdList = schemeIdList;
                return this;
            }

            /**
             * SchemeList.
             */
            public Builder schemeList(DataSchemeList schemeList) {
                this.schemeList = schemeList;
                return this;
            }

            /**
             * SchemeTaskConfigId.
             */
            public Builder schemeTaskConfigId(Long schemeTaskConfigId) {
                this.schemeTaskConfigId = schemeTaskConfigId;
                return this;
            }

            /**
             * SourceDataType.
             */
            public Builder sourceDataType(Integer sourceDataType) {
                this.sourceDataType = sourceDataType;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(Integer type) {
                this.type = type;
                return this;
            }

            /**
             * UpdateTime.
             */
            public Builder updateTime(String updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            /**
             * UpdateUser.
             */
            public Builder updateUser(Long updateUser) {
                this.updateUser = updateUser;
                return this;
            }

            /**
             * UserGroup.
             */
            public Builder userGroup(String userGroup) {
                this.userGroup = userGroup;
                return this;
            }

            /**
             * VocabId.
             */
            public Builder vocabId(String vocabId) {
                this.vocabId = vocabId;
                return this;
            }

            /**
             * VocabName.
             */
            public Builder vocabName(String vocabName) {
                this.vocabName = vocabName;
                return this;
            }

            public DataData build() {
                return new DataData(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @NameInMap("Data")
        private java.util.List < DataData> data;

        private Data(Builder builder) {
            this.data = builder.data;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return data
         */
        public java.util.List < DataData> getData() {
            return this.data;
        }

        public static final class Builder {
            private java.util.List < DataData> data; 

            /**
             * Data.
             */
            public Builder data(java.util.List < DataData> data) {
                this.data = data;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
    public static class Messages extends TeaModel {
        @NameInMap("Message")
        private java.util.List < String > message;

        private Messages(Builder builder) {
            this.message = builder.message;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Messages create() {
            return builder().build();
        }

        /**
         * @return message
         */
        public java.util.List < String > getMessage() {
            return this.message;
        }

        public static final class Builder {
            private java.util.List < String > message; 

            /**
             * Message.
             */
            public Builder message(java.util.List < String > message) {
                this.message = message;
                return this;
            }

            public Messages build() {
                return new Messages(this);
            } 

        } 

    }
}
