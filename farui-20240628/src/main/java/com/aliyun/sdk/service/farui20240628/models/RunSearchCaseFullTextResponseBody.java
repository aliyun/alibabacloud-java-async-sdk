// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.farui20240628.models;

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
 * {@link RunSearchCaseFullTextResponseBody} extends {@link TeaModel}
 *
 * <p>RunSearchCaseFullTextResponseBody</p>
 */
public class RunSearchCaseFullTextResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("httpStatusCode")
    private Long httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("success")
    private Boolean success;

    private RunSearchCaseFullTextResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RunSearchCaseFullTextResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
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
    public Long getHttpStatusCode() {
        return this.httpStatusCode;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private Data data; 
        private Long httpStatusCode; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(RunSearchCaseFullTextResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.httpStatusCode = model.httpStatusCode;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * httpStatusCode.
         */
        public Builder httpStatusCode(Long httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>C844BE6B-33A9-5AC4-A1AE-97B131849E0F</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public RunSearchCaseFullTextResponseBody build() {
            return new RunSearchCaseFullTextResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link RunSearchCaseFullTextResponseBody} extends {@link TeaModel}
     *
     * <p>RunSearchCaseFullTextResponseBody</p>
     */
    public static class TrialCourt extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("city")
        private String city;

        @com.aliyun.core.annotation.NameInMap("commonLevel")
        private String commonLevel;

        @com.aliyun.core.annotation.NameInMap("country")
        private String country;

        @com.aliyun.core.annotation.NameInMap("county")
        private String county;

        @com.aliyun.core.annotation.NameInMap("district")
        private String district;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("province")
        private String province;

        @com.aliyun.core.annotation.NameInMap("specialLevel")
        private String specialLevel;

        private TrialCourt(Builder builder) {
            this.city = builder.city;
            this.commonLevel = builder.commonLevel;
            this.country = builder.country;
            this.county = builder.county;
            this.district = builder.district;
            this.name = builder.name;
            this.province = builder.province;
            this.specialLevel = builder.specialLevel;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TrialCourt create() {
            return builder().build();
        }

        /**
         * @return city
         */
        public String getCity() {
            return this.city;
        }

        /**
         * @return commonLevel
         */
        public String getCommonLevel() {
            return this.commonLevel;
        }

        /**
         * @return country
         */
        public String getCountry() {
            return this.country;
        }

        /**
         * @return county
         */
        public String getCounty() {
            return this.county;
        }

        /**
         * @return district
         */
        public String getDistrict() {
            return this.district;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return province
         */
        public String getProvince() {
            return this.province;
        }

        /**
         * @return specialLevel
         */
        public String getSpecialLevel() {
            return this.specialLevel;
        }

        public static final class Builder {
            private String city; 
            private String commonLevel; 
            private String country; 
            private String county; 
            private String district; 
            private String name; 
            private String province; 
            private String specialLevel; 

            private Builder() {
            } 

            private Builder(TrialCourt model) {
                this.city = model.city;
                this.commonLevel = model.commonLevel;
                this.country = model.country;
                this.county = model.county;
                this.district = model.district;
                this.name = model.name;
                this.province = model.province;
                this.specialLevel = model.specialLevel;
            } 

            /**
             * city.
             */
            public Builder city(String city) {
                this.city = city;
                return this;
            }

            /**
             * commonLevel.
             */
            public Builder commonLevel(String commonLevel) {
                this.commonLevel = commonLevel;
                return this;
            }

            /**
             * country.
             */
            public Builder country(String country) {
                this.country = country;
                return this;
            }

            /**
             * county.
             */
            public Builder county(String county) {
                this.county = county;
                return this;
            }

            /**
             * district.
             */
            public Builder district(String district) {
                this.district = district;
                return this;
            }

            /**
             * name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * province.
             */
            public Builder province(String province) {
                this.province = province;
                return this;
            }

            /**
             * specialLevel.
             */
            public Builder specialLevel(String specialLevel) {
                this.specialLevel = specialLevel;
                return this;
            }

            public TrialCourt build() {
                return new TrialCourt(this);
            } 

        } 

    }
    /**
     * 
     * {@link RunSearchCaseFullTextResponseBody} extends {@link TeaModel}
     *
     * <p>RunSearchCaseFullTextResponseBody</p>
     */
    public static class CaseDomain extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("abstractObj")
        private String abstractObj;

        @com.aliyun.core.annotation.NameInMap("appliedLaws")
        private String appliedLaws;

        @com.aliyun.core.annotation.NameInMap("basicCase")
        private String basicCase;

        @com.aliyun.core.annotation.NameInMap("caseBasic")
        private String caseBasic;

        @com.aliyun.core.annotation.NameInMap("caseCause")
        private String caseCause;

        @com.aliyun.core.annotation.NameInMap("caseFeature")
        private String caseFeature;

        @com.aliyun.core.annotation.NameInMap("caseId")
        private String caseId;

        @com.aliyun.core.annotation.NameInMap("caseNo")
        private String caseNo;

        @com.aliyun.core.annotation.NameInMap("caseSummary")
        private String caseSummary;

        @com.aliyun.core.annotation.NameInMap("caseTitle")
        private String caseTitle;

        @com.aliyun.core.annotation.NameInMap("caseType")
        private String caseType;

        @com.aliyun.core.annotation.NameInMap("closeCaseCause")
        private String closeCaseCause;

        @com.aliyun.core.annotation.NameInMap("courtFindOut")
        private String courtFindOut;

        @com.aliyun.core.annotation.NameInMap("courtThink")
        private String courtThink;

        @com.aliyun.core.annotation.NameInMap("dataFrom")
        private String dataFrom;

        @com.aliyun.core.annotation.NameInMap("disputeFocus")
        private String disputeFocus;

        @com.aliyun.core.annotation.NameInMap("disputeFocusTag")
        private java.util.List<String> disputeFocusTag;

        @com.aliyun.core.annotation.NameInMap("disputedpoints")
        private String disputedpoints;

        @com.aliyun.core.annotation.NameInMap("documentType")
        private String documentType;

        @com.aliyun.core.annotation.NameInMap("judgReason")
        private String judgReason;

        @com.aliyun.core.annotation.NameInMap("keyfacts")
        private String keyfacts;

        @com.aliyun.core.annotation.NameInMap("legalBasis")
        private String legalBasis;

        @com.aliyun.core.annotation.NameInMap("litigants")
        private String litigants;

        @com.aliyun.core.annotation.NameInMap("litigationParticipant")
        private String litigationParticipant;

        @com.aliyun.core.annotation.NameInMap("openCaseCause")
        private String openCaseCause;

        @com.aliyun.core.annotation.NameInMap("preTrialProcess")
        private String preTrialProcess;

        @com.aliyun.core.annotation.NameInMap("referLevel")
        private String referLevel;

        @com.aliyun.core.annotation.NameInMap("refereeGist")
        private String refereeGist;

        @com.aliyun.core.annotation.NameInMap("sourceContent")
        private String sourceContent;

        @com.aliyun.core.annotation.NameInMap("trialCourt")
        private TrialCourt trialCourt;

        @com.aliyun.core.annotation.NameInMap("trialDate")
        private String trialDate;

        @com.aliyun.core.annotation.NameInMap("trialLevel")
        private String trialLevel;

        @com.aliyun.core.annotation.NameInMap("trialProcess")
        private String trialProcess;

        @com.aliyun.core.annotation.NameInMap("trialProgram")
        private String trialProgram;

        @com.aliyun.core.annotation.NameInMap("verdict")
        private String verdict;

        private CaseDomain(Builder builder) {
            this.abstractObj = builder.abstractObj;
            this.appliedLaws = builder.appliedLaws;
            this.basicCase = builder.basicCase;
            this.caseBasic = builder.caseBasic;
            this.caseCause = builder.caseCause;
            this.caseFeature = builder.caseFeature;
            this.caseId = builder.caseId;
            this.caseNo = builder.caseNo;
            this.caseSummary = builder.caseSummary;
            this.caseTitle = builder.caseTitle;
            this.caseType = builder.caseType;
            this.closeCaseCause = builder.closeCaseCause;
            this.courtFindOut = builder.courtFindOut;
            this.courtThink = builder.courtThink;
            this.dataFrom = builder.dataFrom;
            this.disputeFocus = builder.disputeFocus;
            this.disputeFocusTag = builder.disputeFocusTag;
            this.disputedpoints = builder.disputedpoints;
            this.documentType = builder.documentType;
            this.judgReason = builder.judgReason;
            this.keyfacts = builder.keyfacts;
            this.legalBasis = builder.legalBasis;
            this.litigants = builder.litigants;
            this.litigationParticipant = builder.litigationParticipant;
            this.openCaseCause = builder.openCaseCause;
            this.preTrialProcess = builder.preTrialProcess;
            this.referLevel = builder.referLevel;
            this.refereeGist = builder.refereeGist;
            this.sourceContent = builder.sourceContent;
            this.trialCourt = builder.trialCourt;
            this.trialDate = builder.trialDate;
            this.trialLevel = builder.trialLevel;
            this.trialProcess = builder.trialProcess;
            this.trialProgram = builder.trialProgram;
            this.verdict = builder.verdict;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CaseDomain create() {
            return builder().build();
        }

        /**
         * @return abstractObj
         */
        public String getAbstractObj() {
            return this.abstractObj;
        }

        /**
         * @return appliedLaws
         */
        public String getAppliedLaws() {
            return this.appliedLaws;
        }

        /**
         * @return basicCase
         */
        public String getBasicCase() {
            return this.basicCase;
        }

        /**
         * @return caseBasic
         */
        public String getCaseBasic() {
            return this.caseBasic;
        }

        /**
         * @return caseCause
         */
        public String getCaseCause() {
            return this.caseCause;
        }

        /**
         * @return caseFeature
         */
        public String getCaseFeature() {
            return this.caseFeature;
        }

        /**
         * @return caseId
         */
        public String getCaseId() {
            return this.caseId;
        }

        /**
         * @return caseNo
         */
        public String getCaseNo() {
            return this.caseNo;
        }

        /**
         * @return caseSummary
         */
        public String getCaseSummary() {
            return this.caseSummary;
        }

        /**
         * @return caseTitle
         */
        public String getCaseTitle() {
            return this.caseTitle;
        }

        /**
         * @return caseType
         */
        public String getCaseType() {
            return this.caseType;
        }

        /**
         * @return closeCaseCause
         */
        public String getCloseCaseCause() {
            return this.closeCaseCause;
        }

        /**
         * @return courtFindOut
         */
        public String getCourtFindOut() {
            return this.courtFindOut;
        }

        /**
         * @return courtThink
         */
        public String getCourtThink() {
            return this.courtThink;
        }

        /**
         * @return dataFrom
         */
        public String getDataFrom() {
            return this.dataFrom;
        }

        /**
         * @return disputeFocus
         */
        public String getDisputeFocus() {
            return this.disputeFocus;
        }

        /**
         * @return disputeFocusTag
         */
        public java.util.List<String> getDisputeFocusTag() {
            return this.disputeFocusTag;
        }

        /**
         * @return disputedpoints
         */
        public String getDisputedpoints() {
            return this.disputedpoints;
        }

        /**
         * @return documentType
         */
        public String getDocumentType() {
            return this.documentType;
        }

        /**
         * @return judgReason
         */
        public String getJudgReason() {
            return this.judgReason;
        }

        /**
         * @return keyfacts
         */
        public String getKeyfacts() {
            return this.keyfacts;
        }

        /**
         * @return legalBasis
         */
        public String getLegalBasis() {
            return this.legalBasis;
        }

        /**
         * @return litigants
         */
        public String getLitigants() {
            return this.litigants;
        }

        /**
         * @return litigationParticipant
         */
        public String getLitigationParticipant() {
            return this.litigationParticipant;
        }

        /**
         * @return openCaseCause
         */
        public String getOpenCaseCause() {
            return this.openCaseCause;
        }

        /**
         * @return preTrialProcess
         */
        public String getPreTrialProcess() {
            return this.preTrialProcess;
        }

        /**
         * @return referLevel
         */
        public String getReferLevel() {
            return this.referLevel;
        }

        /**
         * @return refereeGist
         */
        public String getRefereeGist() {
            return this.refereeGist;
        }

        /**
         * @return sourceContent
         */
        public String getSourceContent() {
            return this.sourceContent;
        }

        /**
         * @return trialCourt
         */
        public TrialCourt getTrialCourt() {
            return this.trialCourt;
        }

        /**
         * @return trialDate
         */
        public String getTrialDate() {
            return this.trialDate;
        }

        /**
         * @return trialLevel
         */
        public String getTrialLevel() {
            return this.trialLevel;
        }

        /**
         * @return trialProcess
         */
        public String getTrialProcess() {
            return this.trialProcess;
        }

        /**
         * @return trialProgram
         */
        public String getTrialProgram() {
            return this.trialProgram;
        }

        /**
         * @return verdict
         */
        public String getVerdict() {
            return this.verdict;
        }

        public static final class Builder {
            private String abstractObj; 
            private String appliedLaws; 
            private String basicCase; 
            private String caseBasic; 
            private String caseCause; 
            private String caseFeature; 
            private String caseId; 
            private String caseNo; 
            private String caseSummary; 
            private String caseTitle; 
            private String caseType; 
            private String closeCaseCause; 
            private String courtFindOut; 
            private String courtThink; 
            private String dataFrom; 
            private String disputeFocus; 
            private java.util.List<String> disputeFocusTag; 
            private String disputedpoints; 
            private String documentType; 
            private String judgReason; 
            private String keyfacts; 
            private String legalBasis; 
            private String litigants; 
            private String litigationParticipant; 
            private String openCaseCause; 
            private String preTrialProcess; 
            private String referLevel; 
            private String refereeGist; 
            private String sourceContent; 
            private TrialCourt trialCourt; 
            private String trialDate; 
            private String trialLevel; 
            private String trialProcess; 
            private String trialProgram; 
            private String verdict; 

            private Builder() {
            } 

            private Builder(CaseDomain model) {
                this.abstractObj = model.abstractObj;
                this.appliedLaws = model.appliedLaws;
                this.basicCase = model.basicCase;
                this.caseBasic = model.caseBasic;
                this.caseCause = model.caseCause;
                this.caseFeature = model.caseFeature;
                this.caseId = model.caseId;
                this.caseNo = model.caseNo;
                this.caseSummary = model.caseSummary;
                this.caseTitle = model.caseTitle;
                this.caseType = model.caseType;
                this.closeCaseCause = model.closeCaseCause;
                this.courtFindOut = model.courtFindOut;
                this.courtThink = model.courtThink;
                this.dataFrom = model.dataFrom;
                this.disputeFocus = model.disputeFocus;
                this.disputeFocusTag = model.disputeFocusTag;
                this.disputedpoints = model.disputedpoints;
                this.documentType = model.documentType;
                this.judgReason = model.judgReason;
                this.keyfacts = model.keyfacts;
                this.legalBasis = model.legalBasis;
                this.litigants = model.litigants;
                this.litigationParticipant = model.litigationParticipant;
                this.openCaseCause = model.openCaseCause;
                this.preTrialProcess = model.preTrialProcess;
                this.referLevel = model.referLevel;
                this.refereeGist = model.refereeGist;
                this.sourceContent = model.sourceContent;
                this.trialCourt = model.trialCourt;
                this.trialDate = model.trialDate;
                this.trialLevel = model.trialLevel;
                this.trialProcess = model.trialProcess;
                this.trialProgram = model.trialProgram;
                this.verdict = model.verdict;
            } 

            /**
             * abstractObj.
             */
            public Builder abstractObj(String abstractObj) {
                this.abstractObj = abstractObj;
                return this;
            }

            /**
             * appliedLaws.
             */
            public Builder appliedLaws(String appliedLaws) {
                this.appliedLaws = appliedLaws;
                return this;
            }

            /**
             * basicCase.
             */
            public Builder basicCase(String basicCase) {
                this.basicCase = basicCase;
                return this;
            }

            /**
             * caseBasic.
             */
            public Builder caseBasic(String caseBasic) {
                this.caseBasic = caseBasic;
                return this;
            }

            /**
             * caseCause.
             */
            public Builder caseCause(String caseCause) {
                this.caseCause = caseCause;
                return this;
            }

            /**
             * caseFeature.
             */
            public Builder caseFeature(String caseFeature) {
                this.caseFeature = caseFeature;
                return this;
            }

            /**
             * caseId.
             */
            public Builder caseId(String caseId) {
                this.caseId = caseId;
                return this;
            }

            /**
             * caseNo.
             */
            public Builder caseNo(String caseNo) {
                this.caseNo = caseNo;
                return this;
            }

            /**
             * caseSummary.
             */
            public Builder caseSummary(String caseSummary) {
                this.caseSummary = caseSummary;
                return this;
            }

            /**
             * caseTitle.
             */
            public Builder caseTitle(String caseTitle) {
                this.caseTitle = caseTitle;
                return this;
            }

            /**
             * caseType.
             */
            public Builder caseType(String caseType) {
                this.caseType = caseType;
                return this;
            }

            /**
             * closeCaseCause.
             */
            public Builder closeCaseCause(String closeCaseCause) {
                this.closeCaseCause = closeCaseCause;
                return this;
            }

            /**
             * courtFindOut.
             */
            public Builder courtFindOut(String courtFindOut) {
                this.courtFindOut = courtFindOut;
                return this;
            }

            /**
             * courtThink.
             */
            public Builder courtThink(String courtThink) {
                this.courtThink = courtThink;
                return this;
            }

            /**
             * dataFrom.
             */
            public Builder dataFrom(String dataFrom) {
                this.dataFrom = dataFrom;
                return this;
            }

            /**
             * disputeFocus.
             */
            public Builder disputeFocus(String disputeFocus) {
                this.disputeFocus = disputeFocus;
                return this;
            }

            /**
             * disputeFocusTag.
             */
            public Builder disputeFocusTag(java.util.List<String> disputeFocusTag) {
                this.disputeFocusTag = disputeFocusTag;
                return this;
            }

            /**
             * disputedpoints.
             */
            public Builder disputedpoints(String disputedpoints) {
                this.disputedpoints = disputedpoints;
                return this;
            }

            /**
             * documentType.
             */
            public Builder documentType(String documentType) {
                this.documentType = documentType;
                return this;
            }

            /**
             * judgReason.
             */
            public Builder judgReason(String judgReason) {
                this.judgReason = judgReason;
                return this;
            }

            /**
             * keyfacts.
             */
            public Builder keyfacts(String keyfacts) {
                this.keyfacts = keyfacts;
                return this;
            }

            /**
             * legalBasis.
             */
            public Builder legalBasis(String legalBasis) {
                this.legalBasis = legalBasis;
                return this;
            }

            /**
             * litigants.
             */
            public Builder litigants(String litigants) {
                this.litigants = litigants;
                return this;
            }

            /**
             * litigationParticipant.
             */
            public Builder litigationParticipant(String litigationParticipant) {
                this.litigationParticipant = litigationParticipant;
                return this;
            }

            /**
             * openCaseCause.
             */
            public Builder openCaseCause(String openCaseCause) {
                this.openCaseCause = openCaseCause;
                return this;
            }

            /**
             * preTrialProcess.
             */
            public Builder preTrialProcess(String preTrialProcess) {
                this.preTrialProcess = preTrialProcess;
                return this;
            }

            /**
             * referLevel.
             */
            public Builder referLevel(String referLevel) {
                this.referLevel = referLevel;
                return this;
            }

            /**
             * refereeGist.
             */
            public Builder refereeGist(String refereeGist) {
                this.refereeGist = refereeGist;
                return this;
            }

            /**
             * sourceContent.
             */
            public Builder sourceContent(String sourceContent) {
                this.sourceContent = sourceContent;
                return this;
            }

            /**
             * trialCourt.
             */
            public Builder trialCourt(TrialCourt trialCourt) {
                this.trialCourt = trialCourt;
                return this;
            }

            /**
             * trialDate.
             */
            public Builder trialDate(String trialDate) {
                this.trialDate = trialDate;
                return this;
            }

            /**
             * trialLevel.
             */
            public Builder trialLevel(String trialLevel) {
                this.trialLevel = trialLevel;
                return this;
            }

            /**
             * trialProcess.
             */
            public Builder trialProcess(String trialProcess) {
                this.trialProcess = trialProcess;
                return this;
            }

            /**
             * trialProgram.
             */
            public Builder trialProgram(String trialProgram) {
                this.trialProgram = trialProgram;
                return this;
            }

            /**
             * verdict.
             */
            public Builder verdict(String verdict) {
                this.verdict = verdict;
                return this;
            }

            public CaseDomain build() {
                return new CaseDomain(this);
            } 

        } 

    }
    /**
     * 
     * {@link RunSearchCaseFullTextResponseBody} extends {@link TeaModel}
     *
     * <p>RunSearchCaseFullTextResponseBody</p>
     */
    public static class CaseResult extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("caseDomain")
        private CaseDomain caseDomain;

        @com.aliyun.core.annotation.NameInMap("mode")
        private String mode;

        @com.aliyun.core.annotation.NameInMap("similarity")
        private String similarity;

        private CaseResult(Builder builder) {
            this.caseDomain = builder.caseDomain;
            this.mode = builder.mode;
            this.similarity = builder.similarity;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CaseResult create() {
            return builder().build();
        }

        /**
         * @return caseDomain
         */
        public CaseDomain getCaseDomain() {
            return this.caseDomain;
        }

        /**
         * @return mode
         */
        public String getMode() {
            return this.mode;
        }

        /**
         * @return similarity
         */
        public String getSimilarity() {
            return this.similarity;
        }

        public static final class Builder {
            private CaseDomain caseDomain; 
            private String mode; 
            private String similarity; 

            private Builder() {
            } 

            private Builder(CaseResult model) {
                this.caseDomain = model.caseDomain;
                this.mode = model.mode;
                this.similarity = model.similarity;
            } 

            /**
             * caseDomain.
             */
            public Builder caseDomain(CaseDomain caseDomain) {
                this.caseDomain = caseDomain;
                return this;
            }

            /**
             * mode.
             */
            public Builder mode(String mode) {
                this.mode = mode;
                return this;
            }

            /**
             * similarity.
             */
            public Builder similarity(String similarity) {
                this.similarity = similarity;
                return this;
            }

            public CaseResult build() {
                return new CaseResult(this);
            } 

        } 

    }
    /**
     * 
     * {@link RunSearchCaseFullTextResponseBody} extends {@link TeaModel}
     *
     * <p>RunSearchCaseFullTextResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("caseLevel")
        private String caseLevel;

        @com.aliyun.core.annotation.NameInMap("caseResult")
        private java.util.List<CaseResult> caseResult;

        @com.aliyun.core.annotation.NameInMap("currentPage")
        private Integer currentPage;

        @com.aliyun.core.annotation.NameInMap("pageSize")
        private Integer pageSize;

        @com.aliyun.core.annotation.NameInMap("query")
        private String query;

        @com.aliyun.core.annotation.NameInMap("queryKeywords")
        private java.util.List<String> queryKeywords;

        @com.aliyun.core.annotation.NameInMap("totalCount")
        private Long totalCount;

        private Data(Builder builder) {
            this.caseLevel = builder.caseLevel;
            this.caseResult = builder.caseResult;
            this.currentPage = builder.currentPage;
            this.pageSize = builder.pageSize;
            this.query = builder.query;
            this.queryKeywords = builder.queryKeywords;
            this.totalCount = builder.totalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return caseLevel
         */
        public String getCaseLevel() {
            return this.caseLevel;
        }

        /**
         * @return caseResult
         */
        public java.util.List<CaseResult> getCaseResult() {
            return this.caseResult;
        }

        /**
         * @return currentPage
         */
        public Integer getCurrentPage() {
            return this.currentPage;
        }

        /**
         * @return pageSize
         */
        public Integer getPageSize() {
            return this.pageSize;
        }

        /**
         * @return query
         */
        public String getQuery() {
            return this.query;
        }

        /**
         * @return queryKeywords
         */
        public java.util.List<String> getQueryKeywords() {
            return this.queryKeywords;
        }

        /**
         * @return totalCount
         */
        public Long getTotalCount() {
            return this.totalCount;
        }

        public static final class Builder {
            private String caseLevel; 
            private java.util.List<CaseResult> caseResult; 
            private Integer currentPage; 
            private Integer pageSize; 
            private String query; 
            private java.util.List<String> queryKeywords; 
            private Long totalCount; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.caseLevel = model.caseLevel;
                this.caseResult = model.caseResult;
                this.currentPage = model.currentPage;
                this.pageSize = model.pageSize;
                this.query = model.query;
                this.queryKeywords = model.queryKeywords;
                this.totalCount = model.totalCount;
            } 

            /**
             * caseLevel.
             */
            public Builder caseLevel(String caseLevel) {
                this.caseLevel = caseLevel;
                return this;
            }

            /**
             * caseResult.
             */
            public Builder caseResult(java.util.List<CaseResult> caseResult) {
                this.caseResult = caseResult;
                return this;
            }

            /**
             * currentPage.
             */
            public Builder currentPage(Integer currentPage) {
                this.currentPage = currentPage;
                return this;
            }

            /**
             * pageSize.
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * query.
             */
            public Builder query(String query) {
                this.query = query;
                return this;
            }

            /**
             * queryKeywords.
             */
            public Builder queryKeywords(java.util.List<String> queryKeywords) {
                this.queryKeywords = queryKeywords;
                return this;
            }

            /**
             * totalCount.
             */
            public Builder totalCount(Long totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
